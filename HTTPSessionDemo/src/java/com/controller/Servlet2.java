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
public class Servlet2 extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String city=req.getParameter("city");
       String country = req.getParameter("country");
        HttpSession hs2 = req.getSession(false);
        hs2.setAttribute("city", city);
        hs2.setAttribute("country", country);
        RequestDispatcher rd1= req.getRequestDispatcher("form3.html");
        rd1.forward(req, resp);
        
    }

}
