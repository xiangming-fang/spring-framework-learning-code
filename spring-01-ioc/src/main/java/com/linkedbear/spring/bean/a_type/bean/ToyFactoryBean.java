package com.linkedbear.spring.bean.a_type.bean;

import org.springframework.beans.factory.FactoryBean;

public class ToyFactoryBean implements FactoryBean<Toy> {
    
    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }
    
    private Child child;
    
    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }
    
    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }
    
    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public boolean isSingleton() {
        // 这里如果设置成false，那么在从ioc里进行依赖查找的时候，查找几次就会创建几次这个bean
        return true;
    }
}
