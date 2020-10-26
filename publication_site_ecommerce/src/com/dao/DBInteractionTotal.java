package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.model.Article;
import com.model.Commande;
import com.model.User;
import com.model.panier;

@WebService
public class DBInteractionTotal {



	/***********************************************
	 * Ajouter un document
	 * 
	 * @throws SQLException
	 ********************************/
//	bien fait
	@WebMethod(operationName = "AddArticle_A")
	public  void AddArticle(Article a) {

		String query = " INSERT INTO article(des,prix,qte,img) values(?,?,?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
//			String desc, double prix, int qte, String img
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, a.getDesc());
			pr.setDouble(2, a.getPrix());
			pr.setInt(3, a.getQte());
			pr.setString(4, a.getImg());
			pr.execute();
			System.out.println("Articel est ajoute");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}



	/*********************************************
	 * Recherche document
	 *********************************/
//	bien fait
	@WebMethod
	public Article FindArticle(int id) {

		Article l = new Article();
		try {
			String sql = "select * from article where id=?";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if (rs.next()) {
				l.setDesc(rs.getString("des"));
				l.setId(rs.getInt("id"));
				l.setImg(rs.getString("img"));
				l.setPrix(rs.getDouble("prix"));
				l.setQte(rs.getInt("qte"));
				
			}
			pr.close();
			return l;
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	/************************************
	 * Supprimer document
	 ***************************************/
	@WebMethod
	public  void deleteArticle(int id) {
		String sql = "delete from article where id=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
			System.out.println("Article est supprime");
		}catch(SQLException e) {
			e.printStackTrace();
		}		
}
/*  public static void supprimerlignecommande(int ID)
        {
            string query="delete from commande where id="+ID;
            MySqlConnection connection=DAO.getconnectionDAO();
            MySqlCommand command=new MySqlCommand(query,connection);
            command.ExecuteNonQuery();
            Console.WriteLine("its worked");
            connection.Close();
        */
	/**************************************
	 * modifier Dociment
	 ************************************/
//	@WebMethod
//	public int UpdateArticle(int id, Article a) {
//
//		
//		String sql = "update users set 'des'='" + a.getDesc() + "' ,'prix'='" + a.getPrix() + "','qte'='" + a.getQte()
//				+ "','email'='" + a.getImg() + "' where 'id'=" + id;
//		int nb = Maj(sql);
//		disconnect();
//		return nb;
//	}

	/***********************************
	 * Consulter Document
	 ***************************************/
//	bien fait
	@WebMethod
	public ArrayList<Article> AllArticle() {
		ArrayList<Article> ps = new ArrayList<>();
		
		String sql = "select * from article ";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
		PreparedStatement pr = con.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			Article l=new Article();
			l.setId(rs.getInt("id"));
			l.setDesc(rs.getString("des"));
			l.setImg(rs.getString("img"));
			l.setPrix(rs.getDouble("prix"));
			l.setQte(rs.getInt("qte"));
			ps.add(l);
		}} catch (Exception e) {
			e.printStackTrace();
			}
		return ps;
	}
	

	/***********************************
	 * Consulter Document
	 ***************************************/
// bien fait
	@WebMethod
	public void ajoutercommande(Commande a) {
	
		String query = "insert into comm(nomc,prixc) values(?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, a.getNom_client());
			pr.setDouble(2, a.getPrixTotale());
			pr.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	bien fait
	@WebMethod
	public ArrayList<Commande> AllCommande() {

		ArrayList<Commande> ps = new ArrayList<>();
		
		String sql = "select * from comm";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
		PreparedStatement pr = con.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			Commande l=new Commande();
			l.setIdCommande(rs.getInt("idc"));
			l.setNom_client(rs.getString("nomc"));
			l.setPrixTotale(rs.getDouble("prixc"));
			ps.add(l);
		}} catch (Exception e) {
			e.printStackTrace();
			}
		return ps;

		

	}

	/****************************************************
	 * panier
	 *****************************************************/

	// Ajouter au panier bien fait
	@WebMethod
	public void ajouterLivre(panier a) {

		String sql = "insert into panier(nomlivre,prixlivre) values(?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
			PreparedStatement pr = con.prepareStatement(sql);
			 pr.setString(1, a.getNom_livre()); 
			 pr.setDouble(2,a.getPrix_livre());
			 pr.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	bien fait	
	@WebMethod
	public void vider() {
		
		String sql = "TRUNCATE TABLE panier";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

//	bien fait
	@WebMethod
	public ArrayList<panier> Alllivres() {
		ArrayList<panier> ps = new ArrayList<>();
		
		String sql = "select * from panier ";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
		PreparedStatement pr = con.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			panier l=new panier();
			l.setId(rs.getInt("id"));
			l.setNom_livre(rs.getString("nomlivre"));
			l.setPrix_livre(rs.getDouble("prixlivre"));
			ps.add(l);
		}} catch (Exception e) {
			e.printStackTrace();
			}
		return ps;
		

	}

	@WebMethod
	public void deleteliv(int id) {
		
		String sql = "delete from panier where id=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@WebMethod
	public void deleteCmd(int id) {
		
		String sql = "delete from comm where idc=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/*** *************UderDoa************************ */

	/************************* ajouter user *************************/
//	bien fait
	@WebMethod
	public void AddUserW_A(User a) {

		
		String sql = "insert into user(nom,login,password,email) values(?,?,?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setString(1, a.getNom());
			 pr.setString(2, a.getLogin()); 
			 pr.setString(3,a.getPassword());
			 pr.setString(4,a.getEmail());
			 pr.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	

	}

	/*************************** ajouter parametre ********************/
//	@WebMethod
//	public int AddUser(String nom, String login, String password, String email) {
//		connect();
//		String sql = "insert into user(nom,login,password,email) values('" + nom + "','" + login + "','" + password
//				+ "','" + email + "')";
//		int n = Maj(sql);
//		disconnect();
//		return n;
//	}

	/**************************** Recherche user *************************/
//	bien fait
	@WebMethod
	public User FindUser(int id) {

		User l = new User();
		
		String sql = "select * from user where id=?";
	
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if (rs.next()) {
				
				l.setId(rs.getInt("id"));
				l.setNom(rs.getString("nom"));
				l.setEmail(rs.getString("email"));
				l.setLogin(rs.getString("login"));
				l.setPassword(rs.getString("password"));	
			}
			pr.close();
			return l;
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	
	
	/*************************************** Supprimer user ***********************/
//	bien fait
	@WebMethod
	public void deleteUser(int id) {

		String sql = "delete from user where id=?";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
			PreparedStatement pr = (PreparedStatement) con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/************************************** Modifier user ***********************/
//	@WebMethod
//	public int UpdateUser(int id, User u) {
//		connect();
//		String sql = "update users set nom='" + u.getNom() + "' ,login='" + u.getLogin() + "', password='"
//				+ u.getPassword() + "',email='" + u.getEmail() + "' where id=" + id;
//		int nb = Maj(sql);
//		disconnect();
//		return nb;
//	}

	/************************************* Consulter ************************/
//	bien fait
	@WebMethod
	public ArrayList<User> AllUser() {
		ArrayList<User> ps = new ArrayList<>();
		
		String sql = "select * from user ";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root", "");
		PreparedStatement pr = con.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			User l=new User();
			l.setId(rs.getInt("id"));
			l.setNom(rs.getString("nom"));
			l.setEmail(rs.getString("email"));
			l.setLogin(rs.getString("login"));
			l.setPassword(rs.getString("password"));
			ps.add(l);
		}} catch (Exception e) {
			e.printStackTrace();
			}
		return ps;

		
	}

	/**********************************
	 * Authentification
	 **********************************/
//	@WebMethod
//	public Admin AuthAdmin(String nom, String email) {
//		Admin u = null;
//		connect();
//		String sql = "select * from Admin where nomAdmin='" + nom + "' and emailAdmin='" + email + "'";
//		ResultSet rs = Select(sql);
//
//		try {
//			if (rs.next()) {
//				u = new Admin(rs.getString(2), rs.getString(3));
//				u.setId(rs.getInt(1));
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		disconnect();
//		return u;
//	}

//	@WebMethod
//	public User Auth(String nom, String email) {
//		User u = null;
//		connect();
//		String sql = "select * from user where nom='" + nom + "' and email='" + email + "'";
//		ResultSet rs = Select(sql);
//
//		try {
//			if (rs.next()) {
//				u = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//				u.setId(rs.getInt(1));
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		disconnect();
//		return u;
//	}
	
// bien fait	
	@WebMethod(operationName = "isvalidlogin")
	public  User isValidLogin(@WebParam  String email,@WebParam  String nom) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/ecommerce", "root",
				"")) {
			String strSql = "SELECT * FROM user WHERE email=? AND nom=?";
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {
				statement.setString(1, email);
				statement.setString(2, nom);
				try (ResultSet resultSet = statement.executeQuery()) {
					if (resultSet.next()) {
						return new User (resultSet.getString("nom"), resultSet.getString("login"),
								resultSet.getString("password"), resultSet.getString("email")
								);
//						String nom, String login, String password, String email
					} else {
						return null;
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}

	}

}
