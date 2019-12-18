package com.leonardo.person;

import com.leonardo.contract.*;

public class Person {
    protected String name;
    protected int age;
    protected Contract contract;

    public Person(String name, int age, Contract contract) {
        this.name = name;
        this.age = age;
        this.contract = contract;
    }

    public String getName() { return this.name; }

    public int getAge() {
        return this.age;
    }

    public Contract getContract() {
        return this.contract;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
