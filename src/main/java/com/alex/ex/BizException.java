package com.alex.ex;

import com.ql.util.express.exception.QLBizException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends RuntimeException {

    private String msg;

    private String code;

    public BizException( String msg, String code) {
        this.msg = msg;
        this.code = code;
    }
}
