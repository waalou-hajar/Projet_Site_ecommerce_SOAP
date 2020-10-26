package com.dao;

public class DBInteractionTotalProxy implements com.dao.DBInteractionTotal {
  private String _endpoint = null;
  private com.dao.DBInteractionTotal dBInteractionTotal = null;
  
  public DBInteractionTotalProxy() {
    _initDBInteractionTotalProxy();
  }
  
  public DBInteractionTotalProxy(String endpoint) {
    _endpoint = endpoint;
    _initDBInteractionTotalProxy();
  }
  
  private void _initDBInteractionTotalProxy() {
    try {
      dBInteractionTotal = (new com.dao.DBInteractionTotalServiceLocator()).getDBInteractionTotalPort();
      if (dBInteractionTotal != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dBInteractionTotal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dBInteractionTotal)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dBInteractionTotal != null)
      ((javax.xml.rpc.Stub)dBInteractionTotal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dao.DBInteractionTotal getDBInteractionTotal() {
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal;
  }
  
  public void ajouterLivre(com.dao.Panier arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.ajouterLivre(arg0);
  }
  
  public void ajoutercommande(com.dao.Commande arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.ajoutercommande(arg0);
  }
  
  public void vider() throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.vider();
  }
  
  public void addArticle_A(com.dao.Article arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.addArticle_A(arg0);
  }
  
  public com.dao.Article findArticle(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.findArticle(arg0);
  }
  
  public com.dao.Commande[] allCommande() throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.allCommande();
  }
  
  public void deleteliv(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.deleteliv(arg0);
  }
  
  public void deleteCmd(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.deleteCmd(arg0);
  }
  
  public void addUserW_A(com.dao.User arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.addUserW_A(arg0);
  }
  
  public com.dao.User findUser(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.findUser(arg0);
  }
  
  public com.dao.Article[] allArticle() throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.allArticle();
  }
  
  public void deleteArticle(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.deleteArticle(arg0);
  }
  
  public com.dao.Panier[] alllivres() throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.alllivres();
  }
  
  public com.dao.User[] allUser() throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.allUser();
  }
  
  public void deleteUser(int arg0) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    dBInteractionTotal.deleteUser(arg0);
  }
  
  public com.dao.User isvalidlogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (dBInteractionTotal == null)
      _initDBInteractionTotalProxy();
    return dBInteractionTotal.isvalidlogin(arg0, arg1);
  }
  
  
}