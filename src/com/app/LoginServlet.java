package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		//read form Data
		String un=req.getParameter("un");
		String pwd=req.getParameter("pwd");
		PrintWriter out=resp.getWriter();
		out.println("user Name is:"+un);
		out.println("PassWord is:"+pwd);
		
	}

}
