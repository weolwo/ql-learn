package com.alex.config;

import com.alex.ql.PrizeExpressService;
import jakarta.servlet.*;

import java.io.IOException;

public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest,servletResponse);
        } finally {
            PrizeExpressService.clear();
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
