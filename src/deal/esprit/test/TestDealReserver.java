/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.test;

import deal.esprit.dao.CommandeDAO;
import deal.esprit.entities.Commande;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;


public class TestDealReserver {


    public static void main(String[] args) {
         CommandeDAO cDAO = new CommandeDAO();
         List<Commande> c=new ArrayList<>();
         
         c=cDAO.DisplayAllCommandes();
         for (Commande cc : c )
         {
             System.out.println(cc.getId_commande());
             System.out.println(cc.getProduit().getId_Produit());
             System.out.println(cc.getClient().getIdClient());
             System.out.println(cc.getQte());
         }

     
    }
}

    
