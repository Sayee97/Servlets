/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAYEE
 */
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter(); 
          ServletConfig s2 = this.getServletConfig();
          String c1=s2.getInitParameter("AUDI");
          String c2=s2.getInitParameter("ASTON MARTIN");
        ServletContext s1=s2.getServletContext();
        String username = s1.getInitParameter("USERNAME");
        String pass=s1.getInitParameter("PASSWORD");
        
      
        
    
    
    String uen=req.getParameter("Uname");
    String uep=req.getParameter("pwd");
    if(uen.equals(username) && uep.equals(pass)){
        writer.println(c1);
        writer.println(c2);
    }
    else{
        resp.sendError(900,"Incorrect uname or pwd...Please check XML file for predefined UNAME and PWD");
    }
    
    
    }

  

   

}
