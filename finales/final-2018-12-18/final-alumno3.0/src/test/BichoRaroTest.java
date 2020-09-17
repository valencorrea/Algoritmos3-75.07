package test;

import modelo.BichoRaro;
import modelo.CabinaDePeaje;
import modelo.ConTelepase;
import modelo.SinTelepase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BichoRaroTest {

    @Test
    public void testUnTricicloTieneTelepaseEntoncesPaga10Pesos(){

        BichoRaro bichoRaro = new BichoRaro(new ConTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(bichoRaro);

        assertEquals(10, costoPeaje);
    }

    @Test
    public void testUnTricicloNoTieneTelepaseEntoncesPagaSegunSusRuedas(){

        BichoRaro bichoRaro = new BichoRaro(new SinTelepase());
        CabinaDePeaje cabina = new CabinaDePeaje();

        int costoPeaje = cabina.cobrarPeaje(bichoRaro);

        assertEquals(10, costoPeaje);
    }

}
