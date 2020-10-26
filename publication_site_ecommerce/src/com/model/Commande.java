package com.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Commande
{
    private int idCommande ;
    private String nom_client ;
    private double prixTotale ;
    
    public Commande(String nom_client, double prixTotale) {
		this.nom_client = nom_client;
		this.prixTotale = prixTotale;
	}
    
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public double getPrixTotale() {
		return prixTotale;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPrixTotale(double prixTotale) {
		this.prixTotale = prixTotale;
	}
	
  

  
    
}
