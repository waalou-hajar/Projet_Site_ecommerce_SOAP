package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;
import com.dao.Panier;




@WebServlet("/ServletPanier")
public class ServletPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ServletPanier() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

		PrintWriter out=response.getWriter();
		String nom=request.getParameter("nom");
		double prix=Double.parseDouble(request.getParameter("prix"));
		System.out.println(nom+prix);
		Panier p= new Panier(nom,prix);
		if(p!=null)
		System.out.println(p.getId());
		port.ajouterLivre(p);
      request.getRequestDispatcher("ListePanier").forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
