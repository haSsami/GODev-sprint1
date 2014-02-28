/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deal.esprit.dao;

import deal.esprit.util.MyConnectionWamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jihed
 */
public class StatistiqueDao {

    public StatistiqueDao() {
        //constructeur
    }

    public int findNumberOf(String critaire) {
        /*fonction permettant de  recupéré size d'une  table depuis  la  base
        */
        int nb = 0;
        String requete = " SELECT COUNT(*)  AS count FROM `" + critaire + "`";

        try {
            PreparedStatement ps = MyConnectionWamp.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                nb = resultat.getInt("count");
                System.out.println(nb);
            }

            return nb;
        } catch (SQLException ex) {
            System.out.println("erreur de chargement" + ex.getMessage());
            return -1;
        }
    }

    public int findNombreCategorie(String table, String critere, String valeur) {
        /*fonction permettant de  recupéré size d'une  table   selon un critaire
        et une  valeur depuis  la  base  */
        int nb = 0;

        String requete = " SELECT COUNT(*) AS count FROM `" + table + "` WHERE `" + critere + "`=" + valeur;

        try {
            PreparedStatement ps = MyConnectionWamp.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                nb = resultat.getInt("count");
                System.out.println(nb);
            }
            return nb;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return -1;
        }
    }

}
