package com.alex.utils;


import com.alex.bean.BaseReq;
import com.alex.bean.Express;
import com.alex.bean.User;
import com.alex.dao.ExpressMapper;
import com.alex.ql.PrizeExpressService;
import com.ql.util.express.ExpressRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class QlRunnerInitUtil {

    @Autowired
    private PrizeExpressService prizeExpressService;

    @Autowired
    private ExpressMapper expressMapper;

    public static volatile ExpressRunner runner = null;

    /**
     * 制作一个单列的 QlRunnerInitUtil，初始化自定义的方法
     *
     * @param req
     * @return
     * @throws Exception
     */
    public ExpressRunner getRunner(BaseReq req) throws Exception {
        if (runner != null) {
            initThreadLocal(req);
            return runner;
        }
        synchronized (QlRunnerInitUtil.class) {
            if (runner == null) {
                runner = new ExpressRunner(true, false);
                List<Express> list = init();
                for (Express express : list) {
                    runner.addFunctionOfServiceMethod(express.getExpName(), prizeExpressService, express.getMethodName(), express.getParamsEx(), null);
                }
            }
        }
        initThreadLocal(req);
        return runner;
    }

    void initThreadLocal(BaseReq req) {
        User user = new User();
        user.setName(req.getLoginName());
        prizeExpressService.setUserInfo(user);
    }

    public List<Express> init() throws ClassNotFoundException {
        List<Express> list = expressMapper.selectExpressList();
        List<String> paramList = Arrays.asList("int", "double");
        for (Express express : list) {
            List<String> xx = new ArrayList<>();
            //设置参数
            String[] ags = express.getParams().split(",");
            for (String s : ags) {
                String s1 = s.split(" ")[0];
                if (paramList.contains(s1)){
                    xx.add(s1);
                }else {
                    Class<?> aClass = Class.forName(s1);
                    xx.add(aClass.getTypeName());
                }
            }
            String[] arr = new String[xx.size()];
            express.setParamsEx(xx.toArray(arr));
        }
        return list;
    }
}
