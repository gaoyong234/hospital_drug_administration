package com.hospital_purchase.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signinHandlerIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object user = request.getSession().getAttribute("admin");
        if(user == null){
            request.getRequestDispatcher("/").forward(request, response);
            System.out.println("过滤器没有放行");
            return false;
        }else {
            System.out.println("过滤器放行了");
            return true;
        }
    }

}
