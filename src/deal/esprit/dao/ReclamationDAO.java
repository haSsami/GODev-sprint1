/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.dao;

import deal.esprit.entities.Reclamation;
import deal.esprit.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ssawssen
 */
public class ReclamationDAO {
    //insert reclamation
    public void addReclamation(Reclamation r){
        String requete = "insert into reclamation(type,date,description) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,r.getTypeReclamation() );
            ps.setString(2,r.getDateReclamation());
            ps.setString(3,r.getDescriptionReclamation());
         
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    //modififcation selon id
     public void updateReclamation(Reclamation r){
        String requete = "update reclamation set type=?, date=? ,description=? where id=1";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,r.getTypeReclamation() );
            ps.setString(2,r.getDateReclamation());
            ps.setString(3,r.getDescriptionReclamation());
       
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    //suppression reclamation
     
      public void deleteReclamation(int num){

          String requete = "delete from reclamation where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
      
    public List<Reclamation> DisplayAllReclamations (){


        List<Reclamation> listereclamations = new ArrayList<Reclamation>();

        String requete = "select * from reclamation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Reclamation reclamation = new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setTypeReclamation(resultat.getString(2));
                reclamation.setDateReclamation(resultat.getString(3));
                reclamation.setDescriptionReclamation(resultat.getString(4));
                
                listereclamations.add(reclamation);
            }
            return listereclamations;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }
    }
}
