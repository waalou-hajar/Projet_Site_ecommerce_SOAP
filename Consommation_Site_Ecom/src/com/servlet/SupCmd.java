package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBInteractionTotalProxy;

@WebServlet("/SupCmd")
public class SupCmd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SupCmd() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

			int id=Integer.parseInt(request.getParameter("id"));

			port.deleteCmd(id);
			request.getRequestDispatcher("les_commandes.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
