package com.linkedbear.spring.annotation.e_basepackageclass;

import com.linkedbear.spring.annotation.e_basepackageclass.config.BasePackageClassConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class BasePackageClassApplication {
    
    public static void main(String[] args) throws Exception {
        // 我去，这个就是启动类里的主函数写法啊，ioc容器构建的入口
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BasePackageClassConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
