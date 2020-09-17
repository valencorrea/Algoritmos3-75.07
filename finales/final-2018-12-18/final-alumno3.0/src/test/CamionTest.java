package test;

import modelo.CabinaDePeaje;
import modelo.Camion;
import modelo.ConTelepase;
import modelo.SinTelepase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamionTest {

    @Test
    public void testUnAutoTieneTelepaseEntoncesPagaLaMitadDelPeaje(){

        Camion camion = new Camion(new ConTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(camion);

        assertEquals(9, costoPeaje);
    }

    @Test
    public void testUnAutoNoTelepaseEntoncesPaga(){

        Camion camion = new Camion(new SinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(camion);

        assertEquals(36, costoPeaje);
    }

}
