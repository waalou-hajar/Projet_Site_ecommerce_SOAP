package com.servlet;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;
import com.dao.User;

/**
 * Servlet implementation class inscreption
 */

@WebServlet("/inscreption")
public class inscreption extends HttpServlet {
	private static final long serialVersionUID = 1L;
       // la variable

	
		
    public inscreption() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //************ init **********
public void init(ServletConfig config) throws ServletException {
	super.init();

		
	}
//**************** DE GET **********

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

			String nom=request.getParameter("nom");
			String login=request.getParameter("login");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String op=request.getParameter("btn");
			
			System.out.println(nom+""+login+" post"+email);
			if(op.equals("Register"))
			{
				if(!email.equals("") && !nom.equals("") && !login.equals("") && !password.equals("") ) {
					User u = new User();
					u.setNom(nom);
					u.setEmail(email);
					u.setLogin(login);
					u.setPassword(password);
					port.addUserW_A(u);
					System.out.println("c fait");
				}else {
					System.out.println("n est pas valide");
				}
					
			/*HttpSession ses =request.getSession();
					ses.setAttribute("user", u);
					response.sendRedirect("bienvenu2");*/
				//response.sendRedirect("login");
				request.getRequestDispatcher("login.html").forward(request, response);
				
				}
				
				
		
		
	}

	//************ DE POST ********************
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	
		
		doGet(request, response);
		
	}

}
