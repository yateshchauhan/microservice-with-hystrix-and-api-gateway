package com.model;

import java.util.List;

public class Employee {

    private long id;
    private String name;
    private int age;
    private List<Address> addressList;

    public Employee(long id, String name, int age, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addressList = addressList;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addressList=" + addressList +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
