package test;

import modelo.Auto;
import modelo.CabinaDePeaje;
import modelo.PagadorSinTelepase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {
/*
    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Auto auto = new Auto();

        int costoPeaje = auto.pagarPeajeConTelepase();

        assertEquals(4, costoPeaje);
    }
*/
    @Test
    public void testUnAutoNoTieneTelepaseEntoncesPagaSegunCantidadDeRuedas(){

        Auto auto = new Auto(new PagadorSinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(auto);

        assertEquals(8, costoPeaje);
    }

}
