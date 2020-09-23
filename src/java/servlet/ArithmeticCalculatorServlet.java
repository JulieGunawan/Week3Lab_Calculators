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
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                .forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("firstnum");
        String second = request.getParameter("secnum");
        int firstNum, secondNum;
        request.setAttribute("firstNumber", first);
        request.setAttribute("secondNumber", second);
        String message="Result: ";
        
        String calcType=request.getParameter("symbol");
        
        if (first.equals(null)|| first.equalsIgnoreCase("")||second.equals(null)||second.equals("")){
            message += "invalid";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                .forward(request, response);
            return;
        }
        
        try {
            firstNum = Integer.parseInt(first);
            secondNum = Integer.parseInt(second);   
        }
        catch (Exception e){
            message += "--";   
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                    .forward(request, response);
            return;
        }
        
        switch (calcType) {
            case "+":
                message += (firstNum + secondNum);
                break;
            case "-":
                message += (firstNum - secondNum);
                break;
            case "*":
                message += (firstNum * secondNum);
                break;
            case "%":
                message += (firstNum % secondNum);
                break;
            default:
                break;
        }
        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                .forward(request, response);
                   
    }

 
}
