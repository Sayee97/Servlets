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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAYEE
 */
public class Servlet2 extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter w = resp.getWriter();
        String city =req.getParameter("city");
        String country=req.getParameter("country");
        Cookie cc3 = new Cookie("city", city);
           Cookie cc4= new Cookie("country", country);
            resp.addCookie(cc3);
           resp.addCookie(cc4);
           RequestDispatcher rd2 = req.getRequestDispatcher("form3.html");
           
           rd2.forward(req, resp);
        
    }
}
