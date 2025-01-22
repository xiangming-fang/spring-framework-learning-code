package com.linkedbear.spring.annotation.e_basepackageclass.config;

import com.linkedbear.spring.annotation.e_basepackageclass.bean.DemoService;
import com.linkedbear.spring.annotation.e_basepackageclass.component.DemoComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 虽然只指定了这两个类文件加载，但是这两个类文件所处的包以及子包下所有内容都会被加载
@ComponentScan(basePackageClasses = {DemoService.class, DemoComponent.class})
public class BasePackageClassConfiguration {
    
}
