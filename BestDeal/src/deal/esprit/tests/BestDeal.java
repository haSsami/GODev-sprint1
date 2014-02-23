/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.tests;

import deal.esprit.dao.ClientDAO;
import deal.esprit.entities.Client;

/**
 *
 * @author Ssawssen
 */
public class BestDeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//ajout
        Client client =new Client();
        ClientDAO clientDAO =new ClientDAO();
//        client.setNomClient("hammami");
//        client.setPrenomClient("samy");
//        client.setEmailClient("samy.hammami@esprit.tn");
//        client.setTelClient(53544395);
//        client.setDateClient("09/10/1991");
//        client.setSexeClient("m");
//        client.setAdresseClient("ghazela");
//        client.setPseudoClient("sam_41");
//        client.setMdpClient("esprit");
//        clientDAO.insertClient(client);
//        
//        client.setAdresseClient("marsa");
//        clientDAO.updateClient(client);
        
 //       clientDAO.deleteClient(2);
        System.out.println(""+clientDAO.DisplayAllClients().toString());
        
        
        
        
    }
}
