package com.alex.ql;

import com.alex.bean.User;
import com.alex.ex.BizException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PrizeExpressService {

    private static final ThreadLocal<Map<String,Object>> threadLocal = ThreadLocal.withInitial(HashMap::new);
    private static final String USER_INFO = "USERINFO";

    public String selectUser(String loginName,String productId){
        return "archer";
    }


    public String updatedUser(User user){
        return "archer";
    }

    public void buildException(String code,String msg) {
       throw new BizException(msg,code);
    }

    public void setUserInfo(User user){
        threadLocal.get().put(USER_INFO,user);
    }


    public User getUserInfo(int x){
      return (User) threadLocal.get().get(USER_INFO);
    }
    public static void clear(){
        System.out.println("缓存已清除");
        threadLocal.remove();
    }
}
