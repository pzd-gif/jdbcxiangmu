package com.pzd.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;

    private String name;

    private String sex;

    private String age;

    private String address;

    public Student() {
    }

    public Student(String id, String name, String sex, String age ,String address) {
        this.id = id;
        name = name;
        sex = sex;
        age = age;
        address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        age = age;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(String name, String sex, String age,String  address) {
        name = name;
        sex = sex;
        age = age;
        address = address;
    }
}
