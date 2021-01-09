package com.zensar;
import javax.servlet.http.*;
//import javax.servlet.RequestDispatcher;
public class HelloController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
	String name = request.getParameter("userName");
	String city = request.getParameter("City");
		System.out.println("Name:"+name);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		request.setAttribute("name", name);
		request.setAttribute("city", city);
		
		try {
		rd.forward(request, response);
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
	}


}
