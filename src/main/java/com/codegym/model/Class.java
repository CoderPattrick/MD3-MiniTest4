package com.codegym.model;

public class Class {
    int class_id;
    String classCode;
    String name;
    Teacher teacher;

    public Class(String classCode,String name, Teacher teacher) {
        this.classCode = classCode;
        this.name = name;
        this.teacher = teacher;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
    public Class() {
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
