package com.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validate extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
			String name=request.getParameter("user");
			String password=request.getParameter("pass");
			if(password.equals("1234")){
				request.setAttribute("Username", name);
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		         rd.forward(request, response);
		        // response.sendRedirect("login.jsp");
			}
			else{
				out.println("<p>You have entered incorrect password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);
			}
				
		}
		finally {            
            out.close();
        }
		
	}

}
