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
public class Produit {
   private String id_produit;
   public String nom_produit;
   public Object logo;
   public double prix_primaire;
   public int qte_stock;
   public Categorie Categorie;

    public Produit(String id_produit, String nom_produit, Object logo, double prix_primaire, int qte_stock, Categorie Categorie) {
        this.id_produit = id_produit;
        this.nom_produit = nom_produit;
        this.logo = logo;
        this.prix_primaire = prix_primaire;
        this.qte_stock = qte_stock;
        this.Categorie = Categorie;
    }
    public void setId_produit(String id_produit) {
        this.id_produit = id_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setPrix_primaire(double prix_primaire) {
        this.prix_primaire = prix_primaire;
    }

    public void setQte_stock(int qte_stock) {
        this.qte_stock = qte_stock;
    }

    public String getId_produit() {
        return id_produit;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public Object getLogo() {
        return logo;
    }

    public double getPrix_primaire() {
        return prix_primaire;
    }

    public int getQte_stock() {
        return qte_stock;
    }

    public Categorie getCategorie() {
        return Categorie;
    }

    public void setCategorie(Categorie Categorie) {
        this.Categorie = Categorie;
    }

 
    
   
}
