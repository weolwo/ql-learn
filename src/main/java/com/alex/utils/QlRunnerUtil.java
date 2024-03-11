package com.alex.utils;


import com.alex.bean.BaseReq;
import com.alex.bean.User;
import com.alex.ql.PrizeExpressService;
import com.ql.util.express.ExpressRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QlRunnerUtil {

    @Autowired
    private PrizeExpressService prizeExpressService;

    public static volatile ExpressRunner runner = null;

    /**
     * 制作一个单列的 QlRunnerUtil，初始化自定义的方法
     * @param req
     * @return
     * @throws Exception
     */
    public ExpressRunner getRunner(BaseReq req) throws Exception {
        if (runner != null) {
            initThreadLocal(req);
            return runner;
        }
        synchronized (QlRunnerUtil.class) {
            if (runner == null) {
                runner = new ExpressRunner(true, false);
                runner.addFunctionOfServiceMethod("selectUser", prizeExpressService, "selectUser", new String[]{"String"}, null);
                runner.addFunctionOfServiceMethod("updatedUser", prizeExpressService, "updatedUser", new String[]{"String"}, null);
                runner.addFunctionOfServiceMethod("getUserInfo", prizeExpressService, "getUserInfo", new String[]{}, null);
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
}
