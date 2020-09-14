package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.productos.Alfajor;
import main.ar.edu.fiuba.algoiii.formasDePago.Vaca;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VacaTest {

    @Test
    public void testTroncoUnAlfajorPorUnaVaca(){

        Alfajor alfajor = new Alfajor(50);
        alfajor.asociarPrecioIndivudial(new Vaca(100));

        double renta = alfajor.renta();

        // lo comparo con el valor equivalente de la vaca para no violar encapsulamiento
        //preguntando con que clase estoy tratando
        assertEquals(renta, 100.0);
    }

}
