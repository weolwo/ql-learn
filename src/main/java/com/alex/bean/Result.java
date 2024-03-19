package com.alex.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {

    private String code;

    private String msg;

    private Object data;


    public Result(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }
    public Result(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(Object data, String msg){
        return new Result("200",msg,data);
    }

    public static Result fail(String code, String msg){
        return new Result(code,msg);
    }
}
