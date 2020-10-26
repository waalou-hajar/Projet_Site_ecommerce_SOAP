package com.servlet;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Article;
import com.dao.DBInteractionTotal;
import com.dao.DBInteractionTotalProxy;
import com.dao.DBInteractionTotalService;
import com.dao.DBInteractionTotalServiceLocator;



@WebServlet("/addArticle")
public class addArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
		
    
    public addArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DBInteractionTotalProxy port=new DBInteractionTotalProxy();

		PrintWriter out = response.getWriter();
		String desc=request.getParameter("nom");
		double prix=Double.parseDouble(request.getParameter("prix"));
		int qte= Integer.parseInt(request.getParameter("qte"));
		String img="mmmm";
		Article a = new Article();
		a.setDesc(desc);
		a.setPrix(prix);
		a.setImg(img);
		a.setQte(qte);
		port.addArticle_A(a);
		request.getRequestDispatcher("les_articles.jsp").forward(request, response);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
