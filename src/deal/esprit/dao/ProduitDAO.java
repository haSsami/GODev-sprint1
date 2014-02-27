/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import deal.esprit.entities.*;
import deal.esprit.util.MyConnection;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProduitDAO {

    public void insertDeal(Produit p) {

        String requete = "insert into produit(nom_produit,logo,prix_primaire,prix_solde,qte_produit,duree_produit) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getNom_produit());
            ps.setBlob(2, p.getLogoProduit());
            ps.setFloat(3, p.getPrix_primaire());
            ps.setFloat(4, p.getPrix_solde());
            ps.setFloat(5, p.getQte_produit());
            ps.setTime(6, p.getDuree_produit());

            ps.executeUpdate();
            System.out.println("Ajout deal effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion du deal " + ex.getMessage());
        }
    }

    public void updateDeal(Produit p) {
        String requete = "update produit set nom_produit=?, logo=?, prix_primaire=?,prix_solde=?, qte_produit=?, duree_produit=? where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getNom_produit());
            ps.setObject(2, p.getLogoProduit());
            ps.setFloat(3, p.getPrix_primaire());
            ps.setFloat(4, p.getPrix_solde());
            ps.setFloat(5, p.getQte_produit());
            ps.setTime(6, p.getDuree_produit());

            ps.executeUpdate();
            System.out.println("Mise à jour du deal effectuée avec succès");

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour du deal" + ex.getMessage());
        }
    }

    public void deleteDeal(String nom_produit) {
        String requete = "delete from produit where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(2, nom_produit);
            ps.executeUpdate();
            System.out.println("Produit supprimé");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public Produit findProduitById(int id_produit) {
        Produit produit = new Produit();
        String requete = "select * from produit where id_produit=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_produit);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                produit.setId_Produit(resultat.getInt(1));
                System.out.println(produit.getId_Produit());
                produit.setNom_produit(resultat.getString(2));
                System.out.println(produit.getNom_produit());
//                produit.setLogoProduit(resultat.getObject(3));
                produit.setPrix_primaire(resultat.getFloat(4));
                System.out.println(produit.getPrix_primaire());
                produit.setPrix_solde(resultat.getFloat(5));
                System.out.println(produit.getPrix_solde());
                produit.setQte_produit(resultat.getFloat(6));
                System.out.println(produit.getQte_produit());
                produit.setDuree_produit(resultat.getTime(7));
                System.out.println(produit.getDuree_produit());
            }
            return produit;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du deal " + ex.getMessage());
            return null;
        }
    }

    public Produit findDepotByName(String nom_produit) {
        Produit prod = new Produit();
        String requete = "select * from produit where nom_produit = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom_produit);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                prod.setId_Produit(resultat.getInt(1));
                System.out.println("test" + prod.getId_Produit());
                prod.setNom_produit(resultat.getString(2));
                System.out.println(resultat.getString(2));
//                    prod.setLogoProduit(resultat.getObject(3));
                prod.setPrix_primaire(resultat.getFloat(4));
                System.out.println(prod.getPrix_primaire());
                prod.setPrix_solde(resultat.getFloat(5));
                System.out.println(prod.getPrix_solde());
                prod.setQte_produit(resultat.getFloat(6));
                System.out.println(prod.getQte_produit());
                prod.setDuree_produit(resultat.getTime(7));
                System.out.println(prod.getDuree_produit());
            }
            return prod;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du produit " + ex.getMessage());
            return null;
        }
    }

    public List<Produit> DisplayAllDepots() {


        List<Produit> listeprod = new ArrayList<Produit>();

        String requete = "select * from depot";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Produit produit = new Produit();
                BufferedImage wPic = ImageIO.read(this.getClass().getResource("snow.png"));
                JLabel wIcon = new JLabel(new ImageIcon(wPic));
                produit.setId_Produit(resultat.getInt(1));
                produit.setNom_produit(resultat.getString(2));
//              produit.setLogoProduit(resultat.getObject(3));
                produit.setPrix_primaire(resultat.getFloat(4));
                produit.setPrix_solde(resultat.getFloat(5));
                produit.setQte_produit(resultat.getFloat(6));
                produit.setDuree_produit(resultat.getTime(7));
                
                listeprod.add(produit);
            }
            return listeprod;
        } catch (IOException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des produits"
                    + " " + ex.getMessage());
           
        }
         return listeprod;
    }
}
