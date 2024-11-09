package shop_application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class ShopServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");	
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");	
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init");	
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");	
String p_name=		arg0.getParameter("productName");
Integer price=Integer.parseInt(arg0.getParameter("number"));
Integer quantity=Integer.parseInt(arg0.getParameter("quantity"));


System.out.println("product name is:"+p_name);
System.out.println("price is:"+price);
System.out.println("quantity is:"+quantity);
Integer total_Price=price*quantity;
System.out.println("total price is:"+total_Price);
PrintWriter writer=arg1.getWriter();
arg1.setContentType("text/html");
writer.println("done");

		
	}

}
