package com.codegym.dao;

import com.codegym.model.*;
import java.lang.Class;
import java.sql.*;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private String JDBC_URL = "jdbc:mysql://localhost:3306/quanlylophoc?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Journalist251195";
    private String jdbcDriver = "com.mysql.jdbc.Driver";

    private static final String insert_teacher_sql = "insert into giaovien (ten,diachi,sdt) values (?,?,?);";
    private static final String insert_student_sql = "insert into hocsinh (ten,diachi) values (?,?);";
    private static final String insert_class_sql = "insert into lophoc (malop,ten,id_giaovien) values (?,?,?);";
    private static final String get_teacher_by_id_sql = "select * from giaovien where id = ?;";
    private static final String get_student_by_id_sql = "select * from hocsinh where id = ?;";
    private static final String get_class_by_id_sql = "select * from lophoc where id = ?;";
    private static final String get_all_teacher_sql = "select * from giaovien";
    private static final String get_all_student_sql = "select * from hocsinh";
    private static final String get_all_class_sql = "select * from lophoc";
    private static final String delete_teacher_by_id_sql = "delete from giaovien where id = ?;";
    private static final String delete_student_by_id_sql = "delete from hocsinh where id = ?;";
    private static final String delete_class_by_id_sql = "delete from lophoc where id = ?;";
    private static final String update_teacher_sql = "update giaovien set ten = ? , diachi = ? , sdt = ? , ngaysinh = ? where id = ? ; ";
    private static final String update_student_sql = "update hocsinh set ten = ? , diachi = ? , ngaysinh = ? where id = ? ; ";
    private static final String update_class_sql = "update lophoc set malop = ? , ten = ? id_giaovien = ? where id = ? ; ";

    public UserDAOImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try{
            Class.forName(jdbcDriver);
            connection = DriverManager.getConnection(JDBC_URL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException e) {
            System.err.println("Cant create Driver");
        } catch (SQLException e) {
            System.err.println("Cant get connection due to false URl,DB_UserName or Password!");
        }
        return connection;
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        System.out.println(insert_teacher_sql);
        try(
                Connection connection = getConnection();
                PreparedStatement pS = connection.prepareStatement(insert_teacher_sql,Statement.RETURN_GENERATED_KEYS);
                ){
            pS.setString(1,teacher.getName());
            pS.setString(2,teacher.getAddress());
            pS.setString(3,teacher.getPhone());
            System.out.println(pS);
            pS.execute();
            ResultSet rS = pS.getGeneratedKeys();
            int id = rS.getInt(1);
            teacher.setTeacher_id(id);
            System.out.println("Insert done!");
        }
        catch (SQLException e){
            System.err.println("Insert failed!");
        }
    }

    @Override
    public void insertClass(com.codegym.model.Class clas) {
        System.out.println(insert_class_sql);
        try(
                Connection connection = getConnection();
                PreparedStatement pS = connection.prepareStatement(insert_class_sql,Statement.RETURN_GENERATED_KEYS);
        ){
            pS.setString(1,clas.getClassCode());
            pS.setString(2,clas.getName());
            Teacher teacher = clas.getTeacher();
            pS.setInt(3,teacher.getTeacher_id());
            System.out.println(pS);
            pS.execute();
            ResultSet rS = pS.getGeneratedKeys();
            int id = rS.getInt(1);
            clas.setClass_id(id);
            System.out.println("Insert done!");
        }
        catch (SQLException e){
            System.err.println("Insert Failed!");
        }
    }

    @Override
    public void insertStudent(Student student){
        System.out.println(insert_student_sql);
        try(
                Connection connection = getConnection();
                PreparedStatement pS = connection.prepareStatement(insert_student_sql);
        ){
            pS.setString(1,student.getName());
            pS.setString(2,student.getAddress());
            System.out.println(pS);
            pS.execute();
        }
        catch (SQLException e){
            System.err.println("Insert Failed!");
        }
    }

    @Override
    public Teacher selectTeacherById(Teacher teacher) {
        return null;
    }

    @Override
    public Student selectStudentById(Student student) {
        return null;
    }

    @Override
    public Student selectClassById(com.codegym.model.Class clas) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return null;
    }

    @Override
    public List<com.codegym.model.Class> getAllClass() {
        return null;
    }

    @Override
    public boolean deleteTeacherById(int id){
        return false;
    }

    @Override
    public boolean deleteStudentById(int id){
        return false;
    }

    @Override
    public boolean deleteClassById(int id){
        return false;
    }

    @Override
    public boolean updateTeacher(Teacher teacher){
        return false;
    }

    @Override
    public boolean updateStudent(Student student){
        return false;
    }

    @Override
    public boolean updateClass(com.codegym.model.Class inputClass){
        return false;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
