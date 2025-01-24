package com.linkedbear.spring.bean.a_type;

import com.linkedbear.spring.bean.a_type.bean.Child;
import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.bean.ToyFactoryBean;
import com.linkedbear.spring.bean.a_type.config.BeanTypeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanTypeAnnoApplication {
    
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });

        // factorybean 是延时生产的，在去获取的时候才会真正的创建这个对象
        Toy toy1 = ctx.getBean(Toy.class);
        Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(toy1 == toy2);
    
        ToyFactoryBean factoryBean = ctx.getBean(ToyFactoryBean.class);
        System.out.println(factoryBean);
        System.out.println(ctx.getBean("toyFactory"));
        System.out.println(ctx.getBean("&toyFactory"));
    }
}
