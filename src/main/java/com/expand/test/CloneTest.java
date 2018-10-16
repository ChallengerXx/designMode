package com.expand.test;

import com.expand.bean.Person;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(23, "zhang");
        Person p1 = (Person) p.clone();
        System.out.println(p.getName() == p1.getName() ? "clone是浅拷贝" : "clone是深拷贝");
    }
}
