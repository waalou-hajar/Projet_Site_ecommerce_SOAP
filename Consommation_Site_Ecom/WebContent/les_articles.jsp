<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page  import="java.sql.*"%>
      <%@page import="java.util.ArrayList"%>
    <%@page import="com.dao.*"%>
        
        
    
<%@page import="com.dao.Article"%>

    <%
    DBInteractionTotalProxy proxy=new DBInteractionTotalProxy();
		
		Article[] tab= proxy.allArticle();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><title> les Articles</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="theme-color" content="red">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800,900"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>

<body>
	<header>
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<a href="#" class="web-url">www.bookstore.com</a>
					</div>
					<div class="col-md-6">
						<h5>Free Shipping Over $99 + 3 Free Samples With Every Order</h5>
					</div>
					<div class="col-md-3">
						<span class="ph-number">Call : 800 1234 5678</span>
					</div>
				</div>
			</div>
		</div>
		<div class="main-menu">
			<div class="container">
				<nav class="navbar navbar-expand-lg navbar-light">
					<a class="navbar-brand" href="index.html"><img
						src="./images/logo2.jpg" alt="logo"></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav ml-auto">
							<li class="navbar-item"><a href="les_articles.jsp"
								class="nav-link">ARTICLES</a></li>
							<li class="navbar-item"><a href="les_clients.jsp"
								class="nav-link">CLIENTS</a></li>
							<li class="navbar-item"><a href="les_commandes.jsp"
								class="nav-link">COMMANDES</a></li>

							<li class="navbar-item active"><a href="login.html"
								class="nav-link">Déconnecter</a></li>
						</ul>
					</div>
					</br> </br>
</header> 
<form action="addArticle" method="Get">
<table align="center" borter="1">
<tbody>
<tr align="center">
<td colspan="2"> <label style="margin-top:0,5cm;"> Ajouter Livre : </label></td>
</tr>
<tr><td><label>  Nom de livre : </label></td><td><input type="text" name="nom"></td></tr>
<tr><td><label>  Prix de livre:</label></td><td><input type="number" name="prix"></td></tr>
<tr><td><label>  Quantité :</label></td><td><input type="number" name="qte"></td></tr>

<div class="btn-sec" style="margin-top:1cm;">
<tr><td colspan="2"><input type="submit" name="btn" value="Ajouter" class="btn yellow"   >
<input type="submit" name="btn" value="Annuler" class="btn black" ></td></tr>
</div>

</tbody>
</table>
</form>

<div  style="margin-top:2cm;"   >
  <h2 style="text-align:center;" style="color:brouwn;" > Liste des Articles </h2>

</div>
<table  class="table table-striped" style="margin-top:20px;">
<tr><th>Id</th><th>Description</th><th>Prix</th><th>Qantité</th><th>Img</th><th>Option Admin </th></tr>
		<tr>
		<%
		if(tab!=null)
		{
			for(int i=0;i<tab.length;i++ )
			{
		%>
		</tr>
		<tr>
		   <td><%=tab[i].getId()%></td>
			<td><%=tab[i].getDesc()%></td>
			<td><%=tab[i].getPrix()%></td>
			<td><%=tab[i].getQte()%></td>
			<td><img src="C:\Users\hajar\Desktop\img_site\<%=tab[i].getImg()%>" ></td>
			<td><a href="/Consommation_Site_Ecom/SUPArticle?id=<%=tab[i].getId()%>">Supprimer</a></td>
		
			<td></td>
			
			
		</tr>
	<%
			}
		}
			else {
				out.println(" ");
			}
			
		%>

</table>
</br>   
</br>   

  </br>   
   <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="address">
                        <h4>Our Address</h4>
                        <h6>The BookStore Theme, 4th Store
                        Beside that building, USA</h6>
                        <h6>Call : 800 1234 5678</h6>
                        <h6>Email : info@bookstore.com</h6>
                    </div>
                    <div class="timing">
                        <h4>Timing</h4>
                        <h6>Mon - Fri: 7am - 10pm</h6>
                        <h6>​​Saturday: 8am - 10pm</h6>
                        <h6>​Sunday: 8am - 11pm</h6>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="navigation">
                        <h4>Navigation</h4>
                        <ul>
                            <li><a href="index.html">Home</a></li>
                            <li><a href="about.html">About Us</a></li>
                            <li><a href="privacy-policy.html">Privacy Policy</a></li>
                            <li><a href="terms-conditions.html">Terms</a></li>
                            <li><a href="products.html">Products</a></li>
                        </ul>
                    </div>
                    <div class="navigation">
                        <h4>Help</h4>
                        <ul>
                            <li><a href="">Shipping & Returns</a></li>
                            <li><a href="privacy-policy.html">Privacy</a></li>
                            <li><a href="faq.html">FAQ’s</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-5">
                    <div class="form">
                        <h3>Quick Contact us</h3>
                        <h6>We are now offering some good discount 
                            on selected books go and shop them</h6>
                        <form>
                            <div class="row" methode="Auth" action="post">
                                <div class="col-md-6">
                                    <input placeholder="Name" name="nom" required>
                                </div>
                                <div class="col-md-6">
                                    <input type="email" placeholder="Email" name="email" required>
                                </div>
                                <div class="col-md-12">
                                    <textarea placeholder="Messege"></textarea>
                                </div>
                                <div class="col-md-12">
                                    <button class="btn black">Alright, Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="copy-right">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h5>(C) 2017. All Rights Reserved. BookStore Wordpress Theme</h5>
                    </div>
                    <div class="col-md-6">
                        <div class="share align-middle">
                            <span class="fb"><i class="fa fa-facebook-official"></i></span>
                            <span class="instagram"><i class="fa fa-instagram"></i></span>
                            <span class="twitter"><i class="fa fa-twitter"></i></span>
                            <span class="pinterest"><i class="fa fa-pinterest"></i></span>
                            <span class="google"><i class="fa fa-google-plus"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/owl.carousel.min.js"></script>
    <script src="js/custom.js"></script>


</body>
</html>