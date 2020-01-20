package com.example.controller.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author oyxl 10071355
 * @version 1.0
 * @description TODO
 * @date 2020/1/19 16:57
 * @blame 仓储开发组
 **/
public class LoginIntercepter implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(LoginIntercepter.class);

    private String tk;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String token = httpServletRequest.getHeader("token");
        logger.warn("LoginIntercepter ----- preHandle");



        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.warn("LoginIntercepter ----- postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.warn("LoginIntercepter ----- afterCompletion");
    }
}
