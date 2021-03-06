package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;



@WebServlet("/SUPClient")
public class SUPClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    public SUPClient() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

		int id=Integer.parseInt(request.getParameter("id"));

		port.deleteUser(id);
		request.getRequestDispatcher("les_clients.jsp").forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
