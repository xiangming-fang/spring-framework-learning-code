package com.linkedbear.spring.basic_di.d_autowired.config;

import com.linkedbear.spring.basic_di.d_autowired.bean.Cat;
import com.linkedbear.spring.basic_di.d_autowired.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.linkedbear.spring.basic_di.d_autowired.bean")
public class AutowiredConfiguration {

    @Bean
    // 这里的 @Autowired 注解是多余的
    // 在spring执行这个方法的时候,会自动从ioc里查找，并注入一个person实例
//    @Autowired
    public Cat cat(/*@Qualifier("master") */Person person) {
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setPerson(person);
        return cat;
    }
    
    @Bean
    @Primary
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }

}
