package Entite;
// Generated 2018-10-08 14:54:29 by Hibernate Tools 4.3.1



/**
 * LigneCommandeboutique generated by hbm2java
 */
public class LigneCommandeboutique  implements java.io.Serializable {


     private LigneCommandeboutiqueId id;
     private Commandeboutique commandeboutique;
     private Produitboutique produitboutique;
     private Integer quantite;

    public LigneCommandeboutique() {
    }

	
    public LigneCommandeboutique(LigneCommandeboutiqueId id, Commandeboutique commandeboutique, Produitboutique produitboutique) {
        this.id = id;
        this.commandeboutique = commandeboutique;
        this.produitboutique = produitboutique;
    }
    public LigneCommandeboutique(LigneCommandeboutiqueId id, Commandeboutique commandeboutique, Produitboutique produitboutique, Integer quantite) {
       this.id = id;
       this.commandeboutique = commandeboutique;
       this.produitboutique = produitboutique;
       this.quantite = quantite;
    }
   
    public LigneCommandeboutiqueId getId() {
        return this.id;
    }
    
    public void setId(LigneCommandeboutiqueId id) {
        this.id = id;
    }
    public Commandeboutique getCommandeboutique() {
        return this.commandeboutique;
    }
    
    public void setCommandeboutique(Commandeboutique commandeboutique) {
        this.commandeboutique = commandeboutique;
    }
    public Produitboutique getProduitboutique() {
        return this.produitboutique;
    }
    
    public void setProduitboutique(Produitboutique produitboutique) {
        this.produitboutique = produitboutique;
    }
    public Integer getQuantite() {
        return this.quantite;
    }
    
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }




}


