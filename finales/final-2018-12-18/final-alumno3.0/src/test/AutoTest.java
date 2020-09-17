package test;

import modelo.Auto;
import modelo.CabinaDePeaje;
import modelo.ConTelepase;
import modelo.SinTelepase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutoTest {

    @Test
    public void testUnAutoNoTieneTelepaseEntoncesPagaSegunCantidadDeRuedas(){

        Auto auto = new Auto(new SinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(auto);

        assertEquals(8, costoPeaje);
    }

    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Auto auto = new Auto(new ConTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(auto);

        assertEquals(4, costoPeaje);
    }

}
