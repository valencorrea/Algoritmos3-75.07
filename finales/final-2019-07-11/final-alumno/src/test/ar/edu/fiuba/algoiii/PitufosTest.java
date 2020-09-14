package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.*;
import main.ar.edu.fiuba.algoiii.monedas.Dolares;
import main.ar.edu.fiuba.algoiii.monedas.Pesos;
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

    @Test
    public void testDosGaseosasConCosto80YPrecio800EnDolaresTienePromo2X1(){

        Gaseosa gaseosa1 = new Gaseosa(80);
        Gaseosa gaseosa2 = new Gaseosa(80);
        DosPorUno promo = new DosPorUno(500);
        promo.añadirProductos(gaseosa1, gaseosa2);

        promo.asociarPrecioPromo(new Precio(800, new Dolares()));

        double renta = promo.renta();

        assertEquals(39500.0, renta);

    }

    @Test
    public void testelCostoTotalDeUnaPromoConDosGaseosasA80Es(){

        Gaseosa gaseosa1 = new Gaseosa(80);
        Gaseosa gaseosa2 = new Gaseosa(80);
        DosPorUno promo = new DosPorUno(500);
        promo.añadirProductos(gaseosa1, gaseosa2);

        double costoTotal = promo.costo();

        assertEquals(160.0, costoTotal);

    }

}
