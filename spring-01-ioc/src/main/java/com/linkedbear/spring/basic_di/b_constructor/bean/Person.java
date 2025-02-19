package com.linkedbear.spring.basic_di.b_constructor.bean;

public class Person {
    
    private String name;
    private Integer age;

    // 对外开放一个构造方法
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
