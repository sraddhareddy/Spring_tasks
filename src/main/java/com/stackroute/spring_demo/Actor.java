package com.stackroute.spring_demo;

public class Actor {
    private String name;
    private String gender;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name is : " + name + ", Gender is : " + gender + ", Age is : " + age;
    }
}