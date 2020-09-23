/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 751682
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String ageVal = request.getParameter("ageValue");
       int ageNext;
       String message="";
       request.setAttribute("ageValue", ageVal);
      
       if (ageVal==null || ageVal.equals("")){
           request.setAttribute("message", "You must give your current age.");
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
           return;
       }
       
       try {
       
           ageNext = Integer.parseInt(ageVal)+1;
           message = "Your age next birthday will be "+ageNext;
       }
       catch (Exception e){
           message = "You must enter a number";
       }
       
       request.setAttribute("message", message);
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response);
    }



}
