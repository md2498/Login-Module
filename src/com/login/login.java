package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ha.backend.Sender;

import com.login.dao.loginDao;

 
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 String uname=request.getParameter("uname");
		 String pass=request.getParameter("pass");
		 
		 loginDao dao=new loginDao();
	
		 
		 try {
			if(dao.check(uname, pass)) {
				 HttpSession session=request.getSession();
				 session.setAttribute("username",uname);
				 response.sendRedirect("welcome.jsp");
			 }
			 else {
				 response.sendRedirect("login.jsp");
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	}

	 
	 
}
