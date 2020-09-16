package test;

import modelo.Auto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {

    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Auto auto = new Auto();

        int costoPeaje = auto.pagarPeajeConTelepase();

        assertEquals(4, costoPeaje);
    }

    @Test
    public void testUnAutoNoTieneTelepaseEntoncesPagaSegunCantidadDeRuedas(){

        Auto auto = new Auto();

        int costoPeaje = auto.pagarPeajeSinTelepase();

        assertEquals(8, costoPeaje);
    }

}
