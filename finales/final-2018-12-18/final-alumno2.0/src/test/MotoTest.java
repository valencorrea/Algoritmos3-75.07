package test;

import modelo.CabinaDePeaje;
import modelo.Moto;
import modelo.PagadorSinTelepase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    public void testUnaMotoNoTieneTelepaseEntoncesPagaElPeajeSegunSusRuedas(){

        Moto moto = new Moto(new PagadorSinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(moto);

        assertEquals(4, costoPeaje);
    }

}
