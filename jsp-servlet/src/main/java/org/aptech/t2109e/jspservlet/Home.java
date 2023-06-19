//package org.aptech.t2109e.jspservlet;
//
//import java.io.*;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//
//@WebServlet(name = "homeServlet", value = "/home-servlet")
//public class Home extends HttpServlet {
//    private String message;
//    public void init() {
//        message = "Hello Home!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        RequestDispatcher view =  request.getRequestDispatcher("home.jsp");
//        view.forward(request, response);
//    }
//
//    public void destroy() {
//    }
//}