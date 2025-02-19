package commun;

import serveur.ServeurCentraleDeGestion;

import static java.lang.Math.random;

public class Vehicule {

    private long ID;
    private double latitude;
    private double longitude;
    private EtatVehicule etat;

    public Vehicule() {
        this.ID = System.nanoTime();
        this.latitude = random();
        this.longitude = random();
        this.etat = EtatVehicule.STOPPE;
    }

    public long getID() {
        return ID;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public EtatVehicule getEtat() {
        return etat;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setEtat(EtatVehicule etat) {
        this.etat = etat;
    }

    public void demarrer() {
        setEtat(EtatVehicule.DEMARRE);
    }

    public void arreter(){
        setEtat(EtatVehicule.STOPPE);
    }

    public void modifierSaPosition(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public void envoyerSesInformations(ServeurCentraleDeGestion serveurCentraleDeGestion) {

    }
}
