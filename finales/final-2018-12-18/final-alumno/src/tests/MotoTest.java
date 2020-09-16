package tests;

import modelo.Moto;
import modelo.SinTelepase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    public void testUnaMotoNoTieneTelepaseEntoncesPagaElPeajeSegunSusRuedas(){

        Moto moto = new Moto(new SinTelepase());

        int costoPeaje = moto.pagarPeaje();

        assertEquals(4, costoPeaje);
    }

}
