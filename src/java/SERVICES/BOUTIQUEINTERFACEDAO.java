/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICES;

import Entite.Produitboutique;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Administrateur
 */
public interface BOUTIQUEINTERFACEDAO {
    

    public void persist(Object entity);
    public void update(Object entity);
    public Object findById(Object id);
    public void delete(Object entity);
    public List<Produitboutique>findAll();
    public void deleteAll();

}


