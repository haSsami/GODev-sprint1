/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.entities;

/**
 *
 * @author Ssawssen
 */
public class Reclamation {
    private int id_reclamation;
    private String type_reclamation;
    private String date_reclamation;
    
    public Reclamation(){
        
    }
    public int getIdReclamation(){
        return id_reclamation;
    }
    public void setIdReclamation(int id_reclamation){
        this.id_reclamation=id_reclamation;
    }
    public String getTypeReclamation(){
        return type_reclamation;
    }
    public void setTypeReclamation(String type_reclamation){
        this.type_reclamation=type_reclamation;
    }
    public String getDateReclamation(){
        return date_reclamation;
    }
    public void setDateReclamation(String date_reclamation){
        this.date_reclamation=date_reclamation;
    }
}
