/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.presentation;
import deal.esprit.dao.ReclamationDAO;
import deal.esprit.entities.Reclamation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ssawssen
 */
public class AfficherReclamationTable extends AbstractTableModel{
    List <Reclamation> reclamations ;
    String columTab [] ={"Id","Type","Date"};
    
    public AfficherReclamationTable(){
        ReclamationDAO reclamationDAO = new ReclamationDAO();
        reclamations=reclamationDAO.DisplayAllReclamations();
        System.out.println(reclamations);
        
    }
    

    @Override
    public int getRowCount() {
       return reclamations.size();
    }

    @Override
    public int getColumnCount() {
        return columTab.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return reclamations.get(rowIndex).getIdReclamation();
            case 1 :
               return  reclamations.get(rowIndex).getTypeReclamation();
            case 2 :
               return  reclamations.get(rowIndex).getDateReclamation();
           
            default:
                return null;
        }
    }
    
     @Override
    public String getColumnName(int column)
    {
        return columTab[column];
    }
    
}
