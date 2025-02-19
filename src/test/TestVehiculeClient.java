package test;

import client.VehiculeClient;
import commun.ServeurDistant;
import commun.Vehicule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * Test du client véhicule avec un mock du serveur.
 */
public class TestVehiculeClient {
    private ServeurDistant serveurMock;
    private VehiculeClient clientVehicule;

    @BeforeEach
    void setUp() {
        serveurMock = mock(ServeurDistant.class);
        clientVehicule = new VehiculeClient("V1");
    }

    @Test
    void testEnregistrementVehicule() throws Exception {
        clientVehicule.setServeur(serveurMock);
        clientVehicule.enregistrerVehicule();

        verify(serveurMock, times(1)).ajouterVehicule(any(Vehicule.class));
    }

    @Test
    void testMiseAJourPosition() throws Exception {
        clientVehicule.setServeur(serveurMock);
        clientVehicule.mettreAJourPosition();

        verify(serveurMock, times(1)).mettreAJourPosition(any(Vehicule.class));
    }
}
