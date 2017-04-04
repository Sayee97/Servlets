/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAYEE
 */
public class Servlet3 extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        
       
       String name = req.getParameter("name");
       String pwd = req.getParameter("pwd");
       String city = req.getParameter("city");
       String country = req.getParameter("country");
       PrintWriter writer = resp.getWriter();
       writer.println("Username = " + name);
       writer.println("Password = " + pwd);
       writer.println("City = " + city);
       writer.println("Country = " + country);
    }

   
}
