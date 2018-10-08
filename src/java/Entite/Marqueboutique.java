package Entite;
// Generated 2018-10-08 14:54:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marqueboutique generated by hbm2java
 */
public class Marqueboutique  implements java.io.Serializable {


     private byte idmarque;
     private String nom;
     private Set produitboutiques = new HashSet(0);

    public Marqueboutique() {
    }

	
    public Marqueboutique(byte idmarque) {
        this.idmarque = idmarque;
    }
    public Marqueboutique(byte idmarque, String nom, Set produitboutiques) {
       this.idmarque = idmarque;
       this.nom = nom;
       this.produitboutiques = produitboutiques;
    }
   
    public byte getIdmarque() {
        return this.idmarque;
    }
    
    public void setIdmarque(byte idmarque) {
        this.idmarque = idmarque;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set getProduitboutiques() {
        return this.produitboutiques;
    }
    
    public void setProduitboutiques(Set produitboutiques) {
        this.produitboutiques = produitboutiques;
    }




}

