/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.dao;

import deal.esprit.entities.Categorie;
import deal.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author wassim
 */
public class CategorieDAO {
 //Ajout categorie
     public void addCategorie(Categorie cat){
        String requete = "insert into categorie (nom) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, cat.nom_categorie);
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
//Mise a jour categorie
        public void updateCategorie(Categorie cat) throws SQLException{
        String req="select id_categorie from categorie where nom_categorie="+cat.getNom_categorie()+";";
         int id=0;
        try {
        
         Statement statement = MyConnection.getInstance().createStatement();
         ResultSet resultat = statement.executeQuery(req);
         id=resultat.getInt(1);
        }
        catch (SQLException ex) {
            System.out.println("erreur id "+ex.getMessage());
        }
        
        String requete = "update categorie set nom_categorie=? where id_categorie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, cat.getNom_categorie());
            ps.setInt(2,id);
           
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
//suppresion categorie
        public void deleteCategorie(int id){

          String requete = "delete from categorie where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }        
//affihage categorie        
          public List<Categorie> DisplayAllCategories (){


        List<Categorie> listecategories = new ArrayList<>();

        String requete = "select * from categorie";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Categorie categorie =new Categorie();
                categorie.setId_categorie(resultat.getInt(1));
               categorie.setNom_categorie(resultat.getString(2));
                         
                listecategories.add(categorie);
            }
            return listecategories;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }
    
}
    

