package Entite;
// Generated 2018-10-08 14:54:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Produitboutique generated by hbm2java
 */
public class Produitboutique  implements java.io.Serializable {


     private BigDecimal idproduit;
     private Categorieboutique categorieboutique;
     private Factureboutique factureboutique;
     private Marqueboutique marqueboutique;
     private String nomproduit;
     private String description;
     private BigDecimal prix;
     private String formatpro;
     private Integer quantiteenstock;
     private String image;
     private Set tailleboutiques = new HashSet(0);
     private Set descritptionboutiques = new HashSet(0);
     private Set ligneCommandeboutiques = new HashSet(0);

    public Produitboutique() {
    }

	
    public Produitboutique(BigDecimal idproduit) {
        this.idproduit = idproduit;
    }
    public Produitboutique(BigDecimal idproduit, Categorieboutique categorieboutique, Factureboutique factureboutique, Marqueboutique marqueboutique, String nomproduit, String description, BigDecimal prix, String formatpro, Integer quantiteenstock, String image, Set tailleboutiques, Set descritptionboutiques, Set ligneCommandeboutiques) {
       this.idproduit = idproduit;
       this.categorieboutique = categorieboutique;
       this.factureboutique = factureboutique;
       this.marqueboutique = marqueboutique;
       this.nomproduit = nomproduit;
       this.description = description;
       this.prix = prix;
       this.formatpro = formatpro;
       this.quantiteenstock = quantiteenstock;
       this.image = image;
       this.tailleboutiques = tailleboutiques;
       this.descritptionboutiques = descritptionboutiques;
       this.ligneCommandeboutiques = ligneCommandeboutiques;
    }
   
    public BigDecimal getIdproduit() {
        return this.idproduit;
    }
    
    public void setIdproduit(BigDecimal idproduit) {
        this.idproduit = idproduit;
    }
    public Categorieboutique getCategorieboutique() {
        return this.categorieboutique;
    }
    
    public void setCategorieboutique(Categorieboutique categorieboutique) {
        this.categorieboutique = categorieboutique;
    }
    public Factureboutique getFactureboutique() {
        return this.factureboutique;
    }
    
    public void setFactureboutique(Factureboutique factureboutique) {
        this.factureboutique = factureboutique;
    }
    public Marqueboutique getMarqueboutique() {
        return this.marqueboutique;
    }
    
    public void setMarqueboutique(Marqueboutique marqueboutique) {
        this.marqueboutique = marqueboutique;
    }
    public String getNomproduit() {
        return this.nomproduit;
    }
    
    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrix() {
        return this.prix;
    }
    
    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }
    public String getFormatpro() {
        return this.formatpro;
    }
    
    public void setFormatpro(String formatpro) {
        this.formatpro = formatpro;
    }
    public Integer getQuantiteenstock() {
        return this.quantiteenstock;
    }
    
    public void setQuantiteenstock(Integer quantiteenstock) {
        this.quantiteenstock = quantiteenstock;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public Set getTailleboutiques() {
        return this.tailleboutiques;
    }
    
    public void setTailleboutiques(Set tailleboutiques) {
        this.tailleboutiques = tailleboutiques;
    }
    public Set getDescritptionboutiques() {
        return this.descritptionboutiques;
    }
    
    public void setDescritptionboutiques(Set descritptionboutiques) {
        this.descritptionboutiques = descritptionboutiques;
    }
    public Set getLigneCommandeboutiques() {
        return this.ligneCommandeboutiques;
    }
    
    public void setLigneCommandeboutiques(Set ligneCommandeboutiques) {
        this.ligneCommandeboutiques = ligneCommandeboutiques;
    }




}

