/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAYEE
 */
public class Servlet3 extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String age=req.getParameter("age");
       String email = req.getParameter("email");
        HttpSession hs = req.getSession(false);
       
        PrintWriter pw = resp.getWriter();
        pw.println("NAME IS :" + hs.getAttribute("name"));
        pw.println(" ");
         pw.println("PASSWORD IS :" + hs.getAttribute("pwd"));   pw.println(" ");
          pw.println("CITY IS :" + hs.getAttribute("city"));   pw.println(" ");
           pw.println("COUNTRY IS :" + hs.getAttribute("country"));   pw.println(" ");
            pw.println("AGE IS :" + age);   pw.println(" ");
             pw.println("EMAIL IS :" + email);   pw.println(" ");
        
    }

}
