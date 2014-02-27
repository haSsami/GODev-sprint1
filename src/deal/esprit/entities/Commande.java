/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.entities;

import java.util.Date;

/**
 *
 * @author wassim
 */
public class Commande {
  private int id_commande;
  public Produit produit;
  public Client client;
  public Date date_reservation;
  public int qte;

    public Commande() {
    }

    public Commande(int id_commande, Produit produit, Client client, Date date_reservation, int qte) {
        this.id_commande = id_commande;
        this.produit = produit;
        this.client = client;
        this.date_reservation = date_reservation;
        this.qte = qte;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

   
  
  
    
}
