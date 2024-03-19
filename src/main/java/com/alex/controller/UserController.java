package com.alex.controller;

import com.alex.bean.Activity;
import com.alex.bean.BaseReq;
import com.alex.bean.PrizeRecords;
import com.alex.bean.Result;
import com.alex.dao.ActivityMapper;
import com.alex.dao.ExpressMapper;
import com.alex.dao.UserMapper;
import com.alex.ex.BizException;
import com.alex.ql.PrizeExpressService;
import com.alex.utils.QlRunnerInitUtil;
import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import com.ql.util.express.exception.QLBizException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * BY Alex CREATED 2021/8/18
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private QlRunnerInitUtil qlRunner;

    @RequestMapping("/login")
    public Object login(HttpServletRequest request, @RequestBody PrizeRecords records) {
        return userMapper.selectUserList();

    }

    @RequestMapping("/apply")
    public Result apply(HttpServletRequest request, @RequestBody BaseReq req) throws QLBizException {
        long t1 = System.currentTimeMillis();
        Object object = null;
        try {
            ExpressRunner runnerRunner = qlRunner.getRunner(req);
            System.out.println("初始化表达式耗时："+(System.currentTimeMillis()-t1)+"ms");
            IExpressContext<String, Object> context = new DefaultContext<>();
            Activity activity = activityMapper.selectActivityByCode(req.getActivityCode());
            t1 = System.currentTimeMillis();
            object = runnerRunner.execute(activity.getExpress(), context, null, true, false);
        }  catch (Exception e){
            return  Result.fail("500",e.getMessage());
        }
        System.out.println("执行表达式耗时："+(System.currentTimeMillis()-t1)+"ms");
        return Result.success(object,"成功");
    }
}
