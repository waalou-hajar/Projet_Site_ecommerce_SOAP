/**
 * DBInteractionTotal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dao;

public interface DBInteractionTotal extends java.rmi.Remote {
    public void ajouterLivre(com.dao.Panier arg0) throws java.rmi.RemoteException;
    public void ajoutercommande(com.dao.Commande arg0) throws java.rmi.RemoteException;
    public void vider() throws java.rmi.RemoteException;
    public void addArticle_A(com.dao.Article arg0) throws java.rmi.RemoteException;
    public com.dao.Article findArticle(int arg0) throws java.rmi.RemoteException;
    public com.dao.Commande[] allCommande() throws java.rmi.RemoteException;
    public void deleteliv(int arg0) throws java.rmi.RemoteException;
    public void deleteCmd(int arg0) throws java.rmi.RemoteException;
    public void addUserW_A(com.dao.User arg0) throws java.rmi.RemoteException;
    public com.dao.User findUser(int arg0) throws java.rmi.RemoteException;
    public com.dao.Article[] allArticle() throws java.rmi.RemoteException;
    public void deleteArticle(int arg0) throws java.rmi.RemoteException;
    public com.dao.Panier[] alllivres() throws java.rmi.RemoteException;
    public com.dao.User[] allUser() throws java.rmi.RemoteException;
    public void deleteUser(int arg0) throws java.rmi.RemoteException;
    public com.dao.User isvalidlogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
