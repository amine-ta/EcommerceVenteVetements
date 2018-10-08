/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICES;

import Entite.Produitboutique;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Administrateur
 */
class produitDAO implements BOUTIQUEINTERFACEDAO{

    private Session Currentsession=null;
    private Transaction CurrentTransaction= null;
    
    
    @Override
    public void persist(Object entity) {
         Produitboutique produit=(Produitboutique)entity;
         getCurrentsession().save(produit);
    }

    @Override
    public void update(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findById(Object id) { 
        String IdProduit=(String)id;
        Produitboutique unProduit = (Produitboutique) getCurrentsession().get(Produitboutique.class,IdProduit);
        return unProduit;
    }

    

    @Override
    public void delete(Object entity) {
         getCurrentsession().delete(entity);
    }

    @Override
    public List<Produitboutique> findAll() {
        List<Produitboutique> Produits= (List<Produitboutique>) getCurrentsession().createQuery("from Produitboutique").list();
        return Produits;

    }

    @Override
    public void deleteAll() {
     List<Produitboutique> entityList =findAll();
        for (Produitboutique entity : entityList) {
            delete(entity);
        }

    }

    public Session openCurrentSessionwithTransaction() {
        Currentsession = getSessionFactory().openSession();
        CurrentTransaction=Currentsession.beginTransaction();
        return Currentsession;
        
    }

    private static SessionFactory getSessionFactory() {
        return Utilitaire.HibernateUtil.getSessionFactory();
    }

    public void closeCurrentSessionwithTransaction() {
        CurrentTransaction.commit();
        Currentsession.close();             
    }

    public Session getCurrentsession() {
        return Currentsession;
    }

    public Transaction getCurrentTransaction() {
        return CurrentTransaction;
    }

    public Session openCurrentSession() {
        Currentsession = getSessionFactory().openSession();
        return Currentsession;
    }

    public void closeCurrentSession() {
       Currentsession.close();
    }

}
