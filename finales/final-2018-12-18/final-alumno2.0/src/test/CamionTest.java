package test;

import modelo.transportes.Camion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamionTest {

    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Camion camion = new Camion();

        int costoPeaje = camion.pagarPeajeConTelepase();

        assertEquals(9, costoPeaje);
    }

    @Test
    public void testUnAutoNoTelepaseEntoncesPaga(){

        Camion camion = new Camion();

        int costoPeaje = camion.pagarPeajeSinTelepase();

        assertEquals(36, costoPeaje);
    }

}
