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
        
        reclamation.setTypeReclamation("deal perimé");
        reclamation.setDateReclamation("15/12/12");
        reclamation.setDescriptionReclamation("BLABLABLABLABLABLABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBZZHUZUZUZUHDDDzkhbhdhduuuuzuuzuzyyzyyzyzyettetetgdgdgdgsbsbsbsbbsbsq");
        
    
        
     
        
        reclamationDAO.addReclamation(reclamation);
        
        
    }
    
}
