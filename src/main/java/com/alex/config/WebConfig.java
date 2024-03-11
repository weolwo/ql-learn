package com.alex.config;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {


    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        // 设置自己的过滤器
        registrationBean.setFilter(new RequestFilter());
        // 设置自定义的拦截规则
        registrationBean.addUrlPatterns("/*");
        // 设置拦截器的顺序
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
