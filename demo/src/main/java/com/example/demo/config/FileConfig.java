package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class FileConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/image/**").addResourceLocations("file:///opt/jackup_project/image_folder/");
            registry.addResourceHandler("/**").addResourceLocations("file:///opt/jackup_project/static/");
    }
}