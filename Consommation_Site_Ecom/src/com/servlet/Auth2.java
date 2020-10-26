package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;
import com.dao.User;



@WebServlet("/Auth2")
public class Auth2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth2() {
        super();
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();
		
		//PrintWriter out = response.getWriter();
		String nom=request.getParameter("nom");
		String email=request.getParameter("email");
		//System.out.println(nom + email);
		User u =port.isvalidlogin(email,nom);
		
		//int v=ad.Valide(u);
		
		
		if(u!=null)
		{   
			if(u.getNom().equals("hajar") &&  u.getEmail().equals("hajar@123"))
			{
				HttpSession ses =request.getSession();
				ses.setAttribute("user", u);
				request.getRequestDispatcher("f.jsp").forward(request, response);	
		    }
		
			else {
				System.out.println(u.getEmail());
				
				HttpSession ses =request.getSession();
				ses.setAttribute("user", u);
			request.getRequestDispatcher("valider.jsp").forward(request, response);	
				
		        }
		}
		
		else{
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
