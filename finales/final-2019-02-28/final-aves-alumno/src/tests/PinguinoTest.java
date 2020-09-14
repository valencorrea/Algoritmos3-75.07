package tests;

import modelo.Pinguino;
import modelo.superficies.PistaDeHielo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PinguinoTest {

    @Test
    public void testPinguinoEnHieloCorreA5KmPorHora(){

        Pinguino pingui = new Pinguino();

        int velocidad = pingui.correr(new PistaDeHielo());

        assertEquals(velocidad, 5);
    }

    @Test
    public void testPinguinoNadaA20KmPorHora(){

        Pinguino pingui = new Pinguino();

        int velocidad = pingui.nadar();

        assertEquals(velocidad, 20);
    }

}
