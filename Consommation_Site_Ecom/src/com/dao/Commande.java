/**
 * Commande.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dao;

public class Commande  implements java.io.Serializable {
    private int idCommande;

    private java.lang.String nom_client;

    private double prixTotale;

    public Commande() {
    }

    public Commande(
        
           java.lang.String nom_client,
           double prixTotale) {
        
           this.nom_client = nom_client;
           this.prixTotale = prixTotale;
    }


    /**
     * Gets the idCommande value for this Commande.
     * 
     * @return idCommande
     */
    public int getIdCommande() {
        return idCommande;
    }


    /**
     * Sets the idCommande value for this Commande.
     * 
     * @param idCommande
     */
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }


    /**
     * Gets the nom_client value for this Commande.
     * 
     * @return nom_client
     */
    public java.lang.String getNom_client() {
        return nom_client;
    }


    /**
     * Sets the nom_client value for this Commande.
     * 
     * @param nom_client
     */
    public void setNom_client(java.lang.String nom_client) {
        this.nom_client = nom_client;
    }


    /**
     * Gets the prixTotale value for this Commande.
     * 
     * @return prixTotale
     */
    public double getPrixTotale() {
        return prixTotale;
    }


    /**
     * Sets the prixTotale value for this Commande.
     * 
     * @param prixTotale
     */
    public void setPrixTotale(double prixTotale) {
        this.prixTotale = prixTotale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commande)) return false;
        Commande other = (Commande) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idCommande == other.getIdCommande() &&
            ((this.nom_client==null && other.getNom_client()==null) || 
             (this.nom_client!=null &&
              this.nom_client.equals(other.getNom_client()))) &&
            this.prixTotale == other.getPrixTotale();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getIdCommande();
        if (getNom_client() != null) {
            _hashCode += getNom_client().hashCode();
        }
        _hashCode += new Double(getPrixTotale()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commande.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dao.com/", "commande"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCommande");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCommande"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom_client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom_client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixTotale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prixTotale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
