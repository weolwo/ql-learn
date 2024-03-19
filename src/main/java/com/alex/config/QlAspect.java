package com.alex.config;

import com.alex.ex.BizException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 操作日志记录处理
 *
 * @author ruoyi
 */
@Aspect
@Component
public class QlAspect {
    private static final Logger log = LoggerFactory.getLogger(QlAspect.class);




    /**
     * 拦截异常操作
     *
     * @param joinPoint 切点
     * @param e         异常
     */
    @Around(value = "execution(public * com.alex.ql..*.*(..))")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
           return joinPoint.proceed();
        } catch (Throwable e) {
            throw e;
        }
    }
}
