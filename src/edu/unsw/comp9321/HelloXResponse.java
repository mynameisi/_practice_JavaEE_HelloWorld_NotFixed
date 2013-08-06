package edu.unsw.comp9321;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloXResponse
 */
public class HelloXResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloXResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		System.out.println("Servlet invoked");
		out.println("<HTML>"); 
		out.println("<HEAD>");
		String name = request.getParameter("name"); 
		out.println("<TITLE>Hello "+name+"</TITLE>"); 
		out.println("</HEAD>"); 
		out.println("<BODY>");
		String greeting = (String) request.getAttribute("greeting");
		out.println("<H1> "+greeting +" "+ name + "!</H1>"); 
		out.println("</BODY>"); 
		out.println("</HTML>");
	}

}
