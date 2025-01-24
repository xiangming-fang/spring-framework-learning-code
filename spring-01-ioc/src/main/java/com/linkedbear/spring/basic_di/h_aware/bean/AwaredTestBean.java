package com.linkedbear.spring.basic_di.h_aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;


// 说一下我目前对aware的理解：
// aware 是为了让bean能够用到 ioc里的资源，比如在当前bean内部（bean对应的类中）用到ioc里的其它bean，或者感知当前bean的beanname
// 总之就是局部用全局的东西
@Component
public class AwaredTestBean implements ApplicationContextAware, BeanNameAware {
    
    private String beanName;
    private ApplicationContext ctx;
    
    public String getName() {
        return beanName;
    }
    
    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
    
    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
    
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}