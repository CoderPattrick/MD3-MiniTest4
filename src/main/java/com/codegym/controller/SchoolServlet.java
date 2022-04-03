package com.codegym.controller;

import com.codegym.dao.UserDAO;
import com.codegym.dao.UserDAOImpl;
import com.codegym.model.Teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SchoolServlet", value = "/SchoolServlet")
public class SchoolServlet extends HttpServlet {
    UserDAO dao = new UserDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
//        try {
            switch (action) {
                case "createTeacher":
                    showCreateTeacherForm(request, response);
                    break;
            }
//        } catch (SQLException ex) {
//            throw new ServletException(ex);
//        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "createTeacher":
                createTeacher(request, response);
                break;
        }
    }

    private void createTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String phone = request.getParameter("phone");
        if(dob==""){
            dao.insertTeacher(new Teacher(name,address,phone));
        }else {
            dao.insertTeacher(new Teacher(name, address, dob, phone));
        }
        RequestDispatcher rD = request.getRequestDispatcher("create_teacher.jsp");
        rD.forward(request, response);
    }

    private void showCreateTeacherForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rD = request.getRequestDispatcher("create_teacher.jsp");
        rD.forward(request,response);
    }

}
