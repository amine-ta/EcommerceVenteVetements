/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICES;

import Entite.Produitboutique;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class PRODUITSERVICES implements BOUTIQUEINTERFACEDAO{

 

    private static produitDAO produitDao;

 

    public PRODUITSERVICES() {
     produitDao = new produitDAO();

    }



    public void deleteAll() {

        produitDao.openCurrentSessionwithTransaction();

        produitDao.deleteAll();

        produitDao.closeCurrentSessionwithTransaction();

    }

    public produitDAO bookDao() {

        return produitDao;

    }

 
    public void update(Object entity) {
        produitDao.openCurrentSessionwithTransaction();

        produitDao.update(entity);

        produitDao.closeCurrentSessionwithTransaction();
    }

  
    public Object findById(Object id) {
        produitDao.openCurrentSession();
        Object unProduit = produitDao.findById(id);
        produitDao.closeCurrentSession();
        return unProduit;
    }

  
    public void delete(Object entity) {
        produitDao.openCurrentSessionwithTransaction();
        Object unProduit = produitDao.findById(entity);
        produitDao.delete(unProduit);
        produitDao.closeCurrentSessionwithTransaction();
    }

  
    public void persist(Object entity) {
      produitDao.openCurrentSessionwithTransaction();
      produitDao.persist(entity);
      produitDao.closeCurrentSessionwithTransaction();
    }


  
    public List<Produitboutique> findAll() {
        produitDao.openCurrentSession();
        List<Produitboutique> produit = produitDao.findAll();
        produitDao.closeCurrentSession();
        return produit;
    }

}

  