package test;

import modelo.transportes.Moto;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    public void testUnaMotoNoTieneTelepaseEntoncesPagaElPeajeSegunSusRuedas(){

        Moto moto = new Moto();

        int costoPeaje = moto.pagarPeajeSinTelepase();

        assertEquals(4, costoPeaje);
    }

}
