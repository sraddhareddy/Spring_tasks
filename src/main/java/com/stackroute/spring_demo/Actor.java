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
    String getName(){
        return name;
    }

    public void displayActorInfo1()
    {
        System.out.println("Name is : "+name +", Gender is : " +gender+ ", Age is : " +age);
    }
}