package com.mateopa;

public class Person {
    public String name;
    public Integer age;
    public String Gender;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    
    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        Gender = gender;
    }
}
