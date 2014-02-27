/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.dao;

import deal.esprit.entities.Client;
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
public class ClientDAO {
    
    //ajout client
    public void addClient(Client c){
        String requete = "insert into client (nom,prenom,email,tel,datedenaissance,sexe,adresse,pseudo,mdp) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNomClient());
            ps.setString(2, c.getPrenomClient());
            ps.setString(3, c.getEmailClient());
            ps.setInt(4, c.getTelClient());
            ps.setString(5, c.getDateClient());
            ps.setString(6, c.getSexeClient());
            ps.setString(7, c.getAdresseClient());
            ps.setString(8, c.getPseudoClient());
            ps.setString(9, c.getMdpClient());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    //modification selon id vu qu'il est unique
        public void updateClient(Client c){
        String requete = "update client set nom=?, prenom=?, email=?,tel=?, datedenaissance=?, pseudo=?,adresse=?, pseudo=?, mdp=? where id=1";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNomClient());
            ps.setString(2, c.getPrenomClient());
            ps.setString(3, c.getEmailClient());
            ps.setInt(4, c.getTelClient());
            ps.setString(5, c.getDateClient());
            ps.setString(6, c.getSexeClient());
            ps.setString(7, c.getAdresseClient());
            ps.setString(8, c.getPseudoClient());
            ps.setString(9, c.getMdpClient());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
        //suppresion client
        public void deleteClient(int num){

          String requete = "delete from client where id=?";
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
        
   //affihage client 
        
          public List<Client> DisplayAllClients (){


        List<Client> listeclients = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Client client =new Client();
                client.setIdClient(resultat.getInt(1));
               client.setNomClient(resultat.getString(2));
                client.setPrenomClient(resultat.getString(3));
                client.setEmailClient(resultat.getString(4));
                client.setTelClient(resultat.getInt(5));
                client.setDateClient(resultat.getString(6));
                client.setSexeClient(resultat.getString(7));
                client.setAdresseClient(resultat.getString(8));
                client.setPseudoClient(resultat.getString(9));
                client.setMdpClient(resultat.getString(10));                
                listeclients.add(client);
            }
            return listeclients;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des clients "+ex.getMessage());
            return null;
        }
    }
    }
    
