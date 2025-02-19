package tests;

import commun.Vehicule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import serveur.ServeurCentraleDeGestion;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.RemoteException;

/**
 * Tests du serveur central.
 */
public class TestServeurCentraleDeGestion {
    private ServeurCentraleDeGestion serveur;

    @BeforeEach
    void setUp() throws RemoteException {
        serveur = new ServeurCentraleDeGestion();
    }

    @Test
    void testAjouterVehicule() throws RemoteException {
        Vehicule vehicule = new Vehicule();
        long id = vehicule.getID();
        serveur.ajouterVehicule(vehicule);

        assertTrue(serveur.estVehiculeConnu(id));
    }

    @Test
    void testSupprimerVehicule() throws RemoteException {
        Vehicule vehicule = new Vehicule();
        long id = vehicule.getID();
        serveur.ajouterVehicule(vehicule);
        serveur.supprimerVehicule(id);

        assertFalse(serveur.estVehiculeConnu(1));
    }

    @Test
    void testMettreAJourPosition() throws RemoteException {
        Vehicule vehicule = new Vehicule();
        long id = vehicule.getID();
        serveur.ajouterVehicule(vehicule);

        vehicule.modifierSaPosition(46.0, 6.0);
        serveur.mettreAJourPosition(vehicule);

        assertEquals(46.0, serveur.getListe_vehicules_connus().get(id).getLatitude());
    }
}
