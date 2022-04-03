package com.codegym.dao;

//import com.codegym.model.Person;
import com.codegym.model.Student;
import com.codegym.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void insertTeacher(Teacher teacher);
    void insertStudent(Student student);
    void insertClass(com.codegym.model.Class clas);
    Teacher selectTeacherById(Teacher teacher);
    Student selectStudentById(Student student);
    Student selectClassById(com.codegym.model.Class clas);
    List<Student> getAllStudent();
    List<Teacher> getAllTeacher();
    List<com.codegym.model.Class> getAllClass();
    boolean deleteTeacherById(int id);
    boolean deleteStudentById(int id);
    boolean deleteClassById(int id);
    boolean updateTeacher(Teacher teacher);
    boolean updateStudent(Student student);
    boolean updateClass(com.codegym.model.Class inputClass);
}
