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
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter w = resp.getWriter();
        String name =req.getParameter("name");
        String pwd=req.getParameter("pwd");
        Cookie cc1 = new Cookie("name", name);
           Cookie cc2= new Cookie("pwd", pwd);
           resp.addCookie(cc1);
           resp.addCookie(cc2);
           RequestDispatcher rd = req.getRequestDispatcher("Personal.html");
           rd.forward(req, resp);
        
    }

    
}
