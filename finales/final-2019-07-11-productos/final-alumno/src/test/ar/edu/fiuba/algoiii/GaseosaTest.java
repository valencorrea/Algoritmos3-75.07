package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.productos.Gaseosa;
import main.ar.edu.fiuba.algoiii.formasDePago.Precio;
import main.ar.edu.fiuba.algoiii.monedas.Dolares;
import main.ar.edu.fiuba.algoiii.monedas.Pesos;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GaseosaTest {

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


}
