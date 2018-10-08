package Entite;
// Generated 2018-10-08 14:54:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Paiementboutique generated by hbm2java
 */
public class Paiementboutique  implements java.io.Serializable {


     private BigDecimal idpaiement;
     private Factureboutique factureboutique;
     private String typepaiement;
     private Date datedepaiement;
     private BigDecimal montantpayer;

    public Paiementboutique() {
    }

	
    public Paiementboutique(BigDecimal idpaiement) {
        this.idpaiement = idpaiement;
    }
    public Paiementboutique(BigDecimal idpaiement, Factureboutique factureboutique, String typepaiement, Date datedepaiement, BigDecimal montantpayer) {
       this.idpaiement = idpaiement;
       this.factureboutique = factureboutique;
       this.typepaiement = typepaiement;
       this.datedepaiement = datedepaiement;
       this.montantpayer = montantpayer;
    }
   
    public BigDecimal getIdpaiement() {
        return this.idpaiement;
    }
    
    public void setIdpaiement(BigDecimal idpaiement) {
        this.idpaiement = idpaiement;
    }
    public Factureboutique getFactureboutique() {
        return this.factureboutique;
    }
    
    public void setFactureboutique(Factureboutique factureboutique) {
        this.factureboutique = factureboutique;
    }
    public String getTypepaiement() {
        return this.typepaiement;
    }
    
    public void setTypepaiement(String typepaiement) {
        this.typepaiement = typepaiement;
    }
    public Date getDatedepaiement() {
        return this.datedepaiement;
    }
    
    public void setDatedepaiement(Date datedepaiement) {
        this.datedepaiement = datedepaiement;
    }
    public BigDecimal getMontantpayer() {
        return this.montantpayer;
    }
    
    public void setMontantpayer(BigDecimal montantpayer) {
        this.montantpayer = montantpayer;
    }




}

