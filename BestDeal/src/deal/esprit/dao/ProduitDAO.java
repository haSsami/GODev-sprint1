/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.dao;

import deal.esprit.entities.Produit;
import deal.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author wassim
 */
public class ProduitDAO {
   /* public void insertProduit(Produit p)
     {
    String requete = "insert into produit (nom_produit,logo,prix_primaire,qte_stock,id_categorie) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getId_produit());
            ps.setInt(2, p.);
            ps.setInt(3, p.getQte_stock());          
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());}   
    }
    */
}
