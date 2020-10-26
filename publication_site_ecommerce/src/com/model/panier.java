package com.model;

import com.model.Article;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class panier
{

 private int id;
 private String nom_livre;
 private Double prix_livre;
 
 public panier( String nom_livre, Double prix_livre) {
		this.nom_livre = nom_livre;
		this.prix_livre = prix_livre;
	}
 
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public panier() {
	super();
}
public String getNom_livre() {
	return nom_livre;
}
public void setNom_livre(String nom_livre) {
	this.nom_livre = nom_livre;
}
public Double getPrix_livre() {
	return prix_livre;
}
public void setPrix_livre(Double prix_livre) {
	this.prix_livre = prix_livre;
}

 
 

    
}