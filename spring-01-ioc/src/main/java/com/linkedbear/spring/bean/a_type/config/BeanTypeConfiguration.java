package com.linkedbear.spring.bean.a_type.config;

import com.linkedbear.spring.bean.a_type.bean.Ball;
import com.linkedbear.spring.bean.a_type.bean.Child;
import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTypeConfiguration {
    
    @Bean
    public Child child() {
        return new Child();
    }

    // 这里会报错,因为toyFactory()中已有
//    @Bean
//    public Toy ball() {
//        return new Ball("ball");
//    }
    
    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }
}
