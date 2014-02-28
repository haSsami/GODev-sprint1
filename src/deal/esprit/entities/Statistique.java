package deal.esprit.entities;

import deal.esprit.dao.StatistiqueDao;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Jihed
 */
public class Statistique {

    int nombreClient;//-Nombre des Clients
    int nombrePrestataire;//-Nombre des prestataire
    int nombreCategorie;//-Nombre des  categorie 

    public DefaultPieDataset clientPrestataire() {
        /**/
        DefaultPieDataset data = new DefaultPieDataset();
        StatistiqueDao GetNombre = new StatistiqueDao();
        /*---Recuperation du  Nombre des prestataire & Client dans la  base---*/
        nombreClient = GetNombre.findNumberOf("client");
        nombrePrestataire = GetNombre.findNumberOf("prestataire");
        //----------------------------------------------------
        data.setValue("Client", nombreClient);
        data.setValue("Prestataire", nombrePrestataire);
        //----------------------------------------------------
        return data;

    }

    public DefaultPieDataset dealcategorie() {
        //----------------------------------------------------
        //----------------------------------------------------*/
        StatistiqueDao GetNombre = new StatistiqueDao();
        DefaultPieDataset data = new DefaultPieDataset();
        /*---Recuperation du  Nombre des Categorie dans la  base---*/
        nombreCategorie = GetNombre.findNumberOf("categorie");
        /*---Recuperation du  Nombre des Produit selon une categorie donnée  depuis la  base---*/
        for (int i = 1; i < nombreCategorie + 1; i++) {
            data.setValue("Categorie" + i, GetNombre.findNombreCategorie("produit", "categorie", (String.valueOf(i))));
        }
        //----------------------------------------------------
        return data;
    }
}
