package com.linkedbear.spring.annotation.b_di.bean;

public class Cat {
    private String name;

    private Person master;

    public void setMaster(Person master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", master=" + master + '}';
    }
}
