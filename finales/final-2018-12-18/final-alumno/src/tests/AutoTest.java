package tests;

import modelo.Auto;
import modelo.SinTelepase;
import modelo.TieneTelepase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {

    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Auto auto = new Auto(new TieneTelepase());

        int costoPeaje = auto.pagarPeaje();

        assertEquals(4, costoPeaje);
    }

    @Test
    public void testUnAutoNoTieneTelepaseEntoncesPagaSegunCantidadDeRuedas(){

        Auto auto = new Auto(new SinTelepase());

        int costoPeaje = auto.pagarPeaje();

        assertEquals(8, costoPeaje);
    }

}
