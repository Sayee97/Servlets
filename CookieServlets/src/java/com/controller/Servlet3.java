/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        PrintWriter pw = resp.getWriter();
        Cookie[] co=req.getCookies();
        String s1 = req.getParameter("age");
        String s2 = req.getParameter("email");
        pw.println("NAME IS: "+co[0].getValue());
         pw.println("PASSWORD IS: "+co[1].getValue());
          pw.println("CITY IS: "+co[2].getValue());
           pw.println("COUNTRY IS: "+co[3].getValue());
            pw.println("AGE IS:  "+s1);
             pw.println("EMAIL IS:  "+s2);
        
    }

  
}
