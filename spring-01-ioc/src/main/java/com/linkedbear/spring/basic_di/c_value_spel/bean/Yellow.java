package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Yellow {
    
    private String name;
    
    @Value("#{new Integer[5]}")
    private Integer[] orders;

    @Override
    public String toString() {
        return "Yellow{" +
                "name='" + name + '\'' +
                ", orders=" + Arrays.toString(orders) +
                '}';
    }
}
