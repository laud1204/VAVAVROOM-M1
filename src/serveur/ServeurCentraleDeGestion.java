package serveur;

import commun.Vehicule;

import java.util.HashMap;
import java.util.Map;

public class ServeurCentraleDeGestion {

    private Map<Long, Vehicule> liste_vehicules_connus;

    public ServeurCentraleDeGestion() {
        this.liste_vehicules_connus = new HashMap<>();
    }

    public Map<Long, Vehicule> getListe_vehicules_connus() {
        return liste_vehicules_connus;
    }

    public boolean estVehiculeConnu(long idVehicule) {
        return this.liste_vehicules_connus.containsKey(idVehicule);
    }

    public void ajouterVehicule(Vehicule vehicule) {
        this.liste_vehicules_connus.put(vehicule.getID(), vehicule);
    }

    public void supprimerVehicule(long idVehicule) {
    }

    public void mettreAJourPosition(Vehicule vehicule) {
    }
}
