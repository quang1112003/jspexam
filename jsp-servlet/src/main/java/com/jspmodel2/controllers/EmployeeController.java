package com.jspmodel2.controllers;

import com.jspmodel2.daos.EmployeeDAO;
import com.jspmodel2.models.Employee;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EmployeeController", value = "/EmployeeController/*")
public class EmployeeController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String path = request.getRequestURI();
        if(path.endsWith("/Employee")){
            RequestDispatcher view =  request.getRequestDispatcher("/list.jsp");
            view.forward(request, response);
        }else {
            if(path.endsWith("/AddNew")){
                RequestDispatcher view =  request.getRequestDispatcher("/employee.jsp");
                view.forward(request, response);
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String empname;
        String birthday;
        String address;
        String position;
        String department;
        String bt;
        bt = request.getParameter("btAddNew");
        if (bt!=null) {
            empname = request.getParameter("txtName");
            birthday = request.getParameter("txtBirthday");
            address = request.getParameter("txtAddress");
            position = request.getParameter("txtPosition");
            department = request.getParameter("txtDepartment");
            Employee objt = new Employee();
            objt.setFullName(empname);
            objt.setBirthday(birthday);
            objt.setAddress(address);
            objt.setPosition(position);
            objt.setDepartment(department);
            EmployeeDAO.addEmployee(objt);
            response.sendRedirect( getServletContext().getContextPath()+"/EmployeeController/Employee");
        }
    }

}
