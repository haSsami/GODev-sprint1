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
import java.sql.DriverManager;
import deal.esprit.entities.Client;
import deal.esprit.entities.Commande;
import deal.esprit.entities.Produit;
import deal.esprit.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommandeDAO {
    public void insertCommande(Commande c)
    {
     String requete = "insert into commande (id_produit,id_client,qte,date_res) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.produit.getId_Produit());
            ps.setInt(2, c.client.getIdClient());
            ps.setInt(3, c.qte); 
            ps.setDate(4, (Date) c.date_reservation); 
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());}   
    }
    //Mise a jour de la quantite de commande
        public void updateCommande(Commande c) throws SQLException{
        String req="select id_commande from commande where (id_client="+c.getClient().getIdClient()+" AND id_produit="+c.getProduit().getNom_produit()+");";
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
//suppresion Commande
        public void deleteCommande(int id){

          String requete = "delete from commande where id_commande=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }  
//affihage Commande       
          public List<Commande> DisplayAllCommandes (){


        List<Commande> listecommandes = new ArrayList<>();

        String requete = "select * from commande";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Commande commande=new Commande();
                Produit p=new Produit();
                Client c=new Client();
                int id_p;
                int id_c;
                commande.setId_commande(resultat.getInt(1));
                id_p=resultat.getInt(2);
                p.setId_Produit(id_p);
                commande.setProduit(p);
                //commande.produit.setId_Produit(resultat.getInt(2));
                 id_c=resultat.getInt(3);
                 c.setIdClient(id_c);
                 commande.setClient(c);
//                commande.client.setIdClient(resultat.getInt(3));
                commande.setQte(resultat.getInt(4));
                commande.setDate_reservation(resultat.getDate(5));
                       
                listecommandes.add(commande);
            }
            return listecommandes;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des categories "+ex.getMessage());
            return null;
        }
    }
           public List<Commande> DisplayCommandesClient (Client c){


        List<Commande> listecommandes = new ArrayList<>();

        String requete = "select * from commande where id_client="+c.getIdClient()+" ;";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Commande commande=new Commande();
                commande.setId_commande(resultat.getInt(1));
                commande.client.setIdClient(resultat.getInt(2));
                commande.setQte(resultat.getInt(3));
                       
                listecommandes.add(commande);
            }
            return listecommandes;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des categories "+ex.getMessage());
            return null;
        }
    }
}
