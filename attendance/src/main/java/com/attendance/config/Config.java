package com.attendance.config;

import com.attendance.demo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(createInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/zhuce","/api/login");
    }

    //创建实列方法
    public HandlerInterceptor createInterceptor(){
        return new MyInterceptor();
    }
}
