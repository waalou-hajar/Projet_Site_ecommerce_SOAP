package main;

import javax.xml.ws.Endpoint;

import com.dao.DBInteractionTotal;

public class Main {

	public static void main(String[] args) {
		
		try {
			Endpoint.publish("http://localhost:1952/DBinteractionTotale", new DBInteractionTotal());
			System.out.println("Fait...");
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		
	

	}

}
