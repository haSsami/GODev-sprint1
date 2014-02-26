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
   }
