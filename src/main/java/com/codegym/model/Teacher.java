package com.codegym.model;

public class Teacher extends Person{
    private int teacher_id;
    private String phone;

    public Teacher(String name, String address, String dateOfBirth, String phone) {
        super(name, address, dateOfBirth);
        this.phone = phone;
    }

    public Teacher(String name, String address, String phone) {
        super(name, address);
        this.phone = phone;
    }

    public Teacher() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
}
