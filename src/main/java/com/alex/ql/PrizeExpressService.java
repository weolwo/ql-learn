package com.alex.ql;

import com.alex.bean.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PrizeExpressService {

    private static final ThreadLocal<Map<String,Object>> threadLocal = ThreadLocal.withInitial(HashMap::new);
    private static final String USER_INFO = "USERINFO";

    public String selectUser(String loginName){
        return "archer";
    }


    public String updatedUser(String loginName){
        return "archer"+loginName;
    }

    public void setUserInfo(User user){
        threadLocal.get().put(USER_INFO,user);
    }


    public User getUserInfo(){
      return (User) threadLocal.get().get(USER_INFO);
    }
    public static void clear(){
        System.out.println("缓存已清除");
        threadLocal.remove();
    }
}
