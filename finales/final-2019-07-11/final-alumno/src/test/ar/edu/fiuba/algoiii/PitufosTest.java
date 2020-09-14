package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PitufosTest {

    @Test
    public void testUnaGaseosaConCosto100YPrecio200PesosSale100DeRenta(){

        Gaseosa gaseosa = new Gaseosa(100);
        gaseosa.asociarPrecioIndivudial(new Precio(200, new Pesos()));

        double renta = gaseosa.renta();

        assertEquals(renta, 100.0);
    }

    @Test
    public void testUnaGaseosaConCosto100YPrecio10DolaresSale400DeRenta(){

        Gaseosa gaseosa = new Gaseosa(100);
        gaseosa.asociarPrecioIndivudial(new Precio(10, new Dolares()));

        double renta = gaseosa.renta();

        assertEquals(400.0, renta);

    }

    @Test
    public void testDosGaseosasConCosto100YPrecio1200EnPesosTienePromo2X1(){

        Gaseosa gaseosa1 = new Gaseosa(100);
        Gaseosa gaseosa2 = new Gaseosa(100);
        DosPorUno promo = new DosPorUno(200);
        promo.añadirProductos(gaseosa1, gaseosa2);

        promo.asociarPrecioPromo(new Precio(1200, new Pesos()));

        double renta = promo.renta();

        assertEquals(1000.0, renta);

    }

/*
    @Test
    public void test3() {
        Gaseosa gaseosa01 = new Gaseosa();
        Gaseosa gaseosa02 = new Gaseosa();
        DosPorUno combo = new DosPorUno(Arrays.asList(gaseosa01, gaseosa02));

        // combo.setCosto(200);
        gaseosa01.setCosto(100);
        gaseosa02.setCosto(100);

        double renta = combo.setPrecio(1200, Moneda.PESOS);

        assertEquals(1000.0, renta);
    }
*/
}
