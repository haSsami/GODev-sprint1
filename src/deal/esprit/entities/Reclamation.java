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
    private String description_reclamation;
    
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
    public String getDescriptionReclamation(){
        return description_reclamation;
    }
    public void setDescriptionReclamation(String description_reclamation){
        this.description_reclamation=description_reclamation;
    }
}
