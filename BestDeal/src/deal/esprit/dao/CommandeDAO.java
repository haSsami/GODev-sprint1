/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.dao;

/**
 *
 * @author wassim
 */
import deal.esprit.entities.Categorie;
import deal.esprit.entities.Commande;
import deal.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommandeDAO {
    public void insertCommande(Commande c)
    {
     String requete = "insert into commande (id_produit,id_client,qte) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.produit.getId_produit());
            ps.setInt(2, c.client.getIdClient());
            ps.setInt(3, c.qte);          
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());}   
    }
    //Mise a jour de la quantite de commande
        public void updateCommande(Commande c) throws SQLException{
        String req="select id_commande from commande where (id_client="+c.getClient().getIdClient()+" AND id_produit="+c.getProduit().getId_produit()+");";
        int id=0;
        try {
        
         Statement statement = MyConnection.getInstance().createStatement();
         ResultSet resultat = statement.executeQuery(req);
         id=resultat.getInt(1);
        }
        catch (SQLException ex) {
            System.out.println("erreur id "+ex.getMessage());
        }
        
        String requete = "update commande set qte=? where id_commande=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.qte);
            ps.setInt(2,id);
           
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
  
}
