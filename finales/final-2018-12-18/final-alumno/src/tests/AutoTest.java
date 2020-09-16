package tests;

import modelo.Auto;
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

}
