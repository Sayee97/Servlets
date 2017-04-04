/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
      String s1 = req.getParameter("uName");
      String s2=req.getParameter("uPassword");
       PrintWriter writer = resp.getWriter();
      if(s1.equals("Sayee") && s2.equals("1234")){
         // resp.sendRedirect("https://github.com/Sayee97");
         //String u = "http://www.svnit.ac.in/";
          //RequestDispatcher re1 = req.getRequestDispatcher(u);
        //  RequestDispatcher ee = req.getRequestDispatcher("http://www.svnit.ac.in/");
          //ee.forward(req, resp);
          //re1.forward(req, resp);
         writer.println(" <a href=\"http://www.svnit.ac.in/\">Click me</a>");
          
      }
      else
      {
          RequestDispatcher re2 = req.getRequestDispatcher("index.html");
          re2.include(req, resp);
          //resp.sendError(802,"Woops...You encountered error");
      }
      
    }
}
