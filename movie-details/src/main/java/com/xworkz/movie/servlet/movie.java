package com.xworkz.movie.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")

public class movie extends GenericServlet{



	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter writer=arg1.getWriter();
		arg1.setContentType("text/html");
		writer.println("Movie Name"+"<br>");
		writer.println("<head>");
		writer.println("<html>");
		writer.println("<body>");
		writer.print("movie name is:"+arg0.getParameter("movie")+"<br>");
		writer.print("actor name is:"+arg0.getParameter("actor")+"<br>");
		writer.print("actress name is:"+arg0.getParameter("actress")+"<br>");
		writer.print("language is:"+arg0.getParameter("language")+"<br>");
	
		
	}

}
