package com.expand.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Cloneable {
    private int age;
    private String name;

    public Person(){}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
