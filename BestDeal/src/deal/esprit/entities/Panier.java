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

    
    private String id_panier;
    public int nombre_point_fidelite;
    public List Commande;
    
    public Panier(String id_panier, int nombre_point_fidelite, List Commande) {
        this.id_panier = id_panier;
        this.nombre_point_fidelite = nombre_point_fidelite;
        this.Commande = Commande;
    }

    public void setId_panier(String id_panier) {
        this.id_panier = id_panier;
    }

    public void setNombre_point_fidelite(int nombre_point_fidelite) {
        this.nombre_point_fidelite = nombre_point_fidelite;
    }

    public void setCommande(List Commande) {
        this.Commande = Commande;
    }

    public String getId_panier() {
        return id_panier;
    }

    public int getNombre_point_fidelite() {
        return nombre_point_fidelite;
    }

    public List getCommande() {
        return Commande;
    }
    
}
