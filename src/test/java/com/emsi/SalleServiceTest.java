package com.emsi;

import com.emsi.entities.Salle;
import com.emsi.services.SalleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalleServiceTest {

    @Test
    public void testCreateSalle() {
        SalleService service = new SalleService();
        Salle salle = new Salle();
        salle.setNom("S2");
        salle.setLibelle("Salle Réseau");

        boolean result = service.create(salle);
        Assertions.assertTrue(result, "La création de la salle doit réussir");
    }
}
