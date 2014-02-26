/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deal.esprit.entities;

import java.util.List;

/**
 *
 * @author wassim
 */
public class Panier {

    
    private int id_panier;
    public List Commande;

    public Panier() {
    }

    public Panier(int id_panier, List Commande) {
        this.id_panier = id_panier;
        this.Commande = Commande;
    }

    public int getId_panier() {
        return id_panier;
    }

    public void setId_panier(int id_panier) {
        this.id_panier = id_panier;
    }

    public List getCommande() {
        return Commande;
    }

    public void setCommande(List Commande) {
        this.Commande = Commande;
    }
    
    
    
}
