/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.entities;

/**
 *
 * @author Ssawssen
 */
public class Client {
    
    private int id_client;
    private String nom_client;
    private String prenom_client;
    private String email_client;
    private int tel_client;
    private String adresse_client;
    private String pseudo_client;
    private String mdp_client;
    private String date_client;
    private String sexe_client;
    
    public Client (){
    }
    public int getIdClient(){
        return id_client;
    }
    public void setIdClient(int id_client){
        this.id_client=id_client;
    }
    public String getNomClient(){
        return nom_client;
    }
    public void setNomClient(String nom_client){
        this.nom_client=nom_client;
    }
    public String getPrenomClient(){
        return prenom_client;
    }
    public void setPrenomClient(String prenom_client){
        this.prenom_client=prenom_client;
    }
    public String getAdresseClient(){
        return adresse_client;
    }
    public void setAdresseClient(String adresse_client){
        this.adresse_client=adresse_client;
    }
    public String getEmailClient(){
        return email_client;
    }
    public void setEmailClient(String email_client){
        this.email_client=email_client;
    }
    public int getTelClient(){
        return tel_client;
    }
    public void setTelClient(int tel_client){
        this.tel_client=tel_client;
    }
    public String getPseudoClient(){
        return pseudo_client;
    }
    public void setPseudoClient(String pseudo_client){
        this.pseudo_client=pseudo_client;
    }
    public String getMdpClient(){
        return mdp_client;
    }
    public void setMdpClient(String mdp_client){
        this.mdp_client=mdp_client;
    }
    public String getDateClient(){
        return date_client;
    }
    public void setDateClient(String date_client){
        this.date_client=date_client;
    }
    public String getSexeClient() {
        return sexe_client;
    }
    public void setSexeClient(String sexe_client){
        this.sexe_client=sexe_client;
    }
}
