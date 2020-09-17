package test;

import modelo.CabinaDePeaje;
import modelo.Moto;
import modelo.SinTelepase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    public void testUnaMotoNoTieneTelepaseEntoncesPagaElPeajeSegunSusRuedas(){

        Moto moto = new Moto(new SinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(moto);

        assertEquals(4, costoPeaje);
    }

}
