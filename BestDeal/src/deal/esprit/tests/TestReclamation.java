/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.tests;

import deal.esprit.dao.ReclamationDAO;
import deal.esprit.entities.Reclamation;

/**
 *
 * @author Ssawssen
 */
public class TestReclamation {
    
    public static void main(String[] args) {
        Reclamation reclamation = new Reclamation();
        ReclamationDAO reclamationDAO = new ReclamationDAO();
        
        reclamation.setTypeReclamation("probleme dans la rubrique notification");
        reclamation.setDateReclamation("15/12/12");
        
        reclamationDAO.addReclamation(reclamation);
        
        
    }
    
}
