/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.test;


import deal.esprit.dao.ProduitDAO;
import deal.esprit.entities.Produit;

public class TestAddDeal {


    public static void main(String[] args) {
        Produit pr = new Produit();
        ProduitDAO prDAO = new ProduitDAO();
        pr.setNom_produit("Nina Rici");
//        pr.setLogoProduit(null);
        pr.setPrix_primaire(170);
        pr.setPrix_solde(145);
//        pr.setDuree_produit(null);
        prDAO.insertDeal(pr);
    }
}

    
