package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DBInteractionTotalProxy;

@WebServlet("/Deconnecter")
public class Deconnecter extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Deconnecter() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DBInteractionTotalProxy port=new DBInteractionTotalProxy();
		HttpSession session = request.getSession(true);
		if(session.getAttribute("user")!=null) {
			session.invalidate();
			
			System.out.println("session est vide");
			port.vider();
			
			
			this.getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}else {
			System.out.println("session is  null");
			port.vider();
			this.getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
			
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
