/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.entities;

/**
 *
 * @author wassim
 */
public class Commande {
  private int id_commande;
  public Produit produit;
  public Client client;
  public int qte;

    public Commande(int id_commande, Produit produit, Client client, int qte) {
        this.id_commande = id_commande;
        this.produit = produit;
        this.client = client;
        this.qte = qte;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getId_commande() {
        return id_commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public Client getClient() {
        return client;
    }

    public int getQte() {
        return qte;
    }
  
  
    
}
