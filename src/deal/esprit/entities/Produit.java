/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.entities;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Time;

/**
 *
 * @author ITECH-NABEUL
 */
public class Produit {

    private int id_produit;
    private String nom_produit;
    private Blob logo;
    private float prix_primaire;
    private float prix_solde;
    private float qte_produit;
    private Time duree_produit;

    public Blob getLogoProduit() {
        return logo;
    }

    public void setLogoProduit(Blob logo) {
        this.logo = logo;
    }

    public float getPrix_primaire() {
        return prix_primaire;
    }

    public void setPrix_primaire(float prix_primaire) {
        this.prix_primaire = prix_primaire;
    }

    public float getPrix_solde() {
        return prix_solde;
    }

    public void setPrix_solde(float prix_solde) {
        this.prix_solde = prix_solde;
    }

    public float getQte_produit() {
        return qte_produit;
    }

    public void setQte_produit(float qte_produit) {
        this.qte_produit = qte_produit;
    }

    public Time getDuree_produit() {
        return duree_produit;
    }

    public void setDuree_produit(Time duree_produit) {
        this.duree_produit = duree_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public int getId_Produit() {
        return id_produit;
    }

    public void setId_Produit(int Id_produit) {
        this.id_produit = Id_produit;
    }

   
    
}
