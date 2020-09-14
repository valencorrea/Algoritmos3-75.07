package tests;

import modelo.AbelPintos;
import modelo.PistaAtletismo;
import modelo.PistaDeHielo;
import modelo.SupDeBarro;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AbelPintosTest {

    @Test
    public void testAbelCantaLaLlave(){

        AbelPintos abel = new AbelPintos();

        String canto = abel.cantar();

        assertEquals(canto, "vas a verme llegar vas a oir mi cancion");

    }

    @Test
    public void testAbelCorreEnUnaSupDeAtletismoA15KmPorHora(){

        AbelPintos abel = new AbelPintos();

        int kmPorHora = abel.correr(new PistaAtletismo());

        assertEquals(kmPorHora, 15);

    }

    @Test
    public void testAbelCorreEnUnaSupDeBarroA2KmPorHora(){

        AbelPintos abel = new AbelPintos();

        int kmPorHora = abel.correr(new SupDeBarro());

        assertEquals(kmPorHora, 2);

    }

    @Test
    public void testAbelNoPuedeDarNiUnPasoEnUnaPistaDeHielo(){

        AbelPintos abel = new AbelPintos();

        int kmPorHora = abel.correr(new PistaDeHielo());

        assertEquals(kmPorHora, 0);

    }

}
