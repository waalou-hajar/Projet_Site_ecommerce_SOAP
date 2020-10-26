package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Commande;
import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;




@WebServlet("/ServletCommande")
public class ServletCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ServletCommande() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();
         
		 String nomClient=(String) request.getParameter("nomClient");
		 
		 double PrixTotale=Double.parseDouble((String) request.getParameter("prixtotale"));
		 
		System.out.println(nomClient+" "+PrixTotale);
		Commande c= new Commande(nomClient,PrixTotale);
		if(c!=null)
		port.ajoutercommande(c);
		
		port.vider();
		
      request.getRequestDispatcher("shop.html").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
