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



@WebServlet("/SUPliv")
public class SUPliv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
    public SUPliv() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

		int id=Integer.parseInt(request.getParameter("id"));
		
		port.deleteliv(id);
		request.getRequestDispatcher("les_livrespanier.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
