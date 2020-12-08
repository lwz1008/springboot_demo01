package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: lhq
 * @Date: 2020/9/3 10:47
 * @Description:
 */
@Configuration  //声明配置类
public class WebMvcConfig implements WebMvcConfigurer {


    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/myPic/**").addResourceLocations("file:C:\\pic\\");

    }


}
