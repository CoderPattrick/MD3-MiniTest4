package com.codegym.model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Person {
    private String name;
    private String address;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String address, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }
}
