package tests;

import modelo.Gorrion;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GorrionTest {

    @Test
    public void testUnGorrionAlVolarDevuelveSuVelocidad(){

        Gorrion gorrion = new Gorrion(50, "pio pio");

        int velocidad = gorrion.volar();

        assertEquals(velocidad, 50);

    }

    @Test
    public void testUnGorrionAlCantarDevuelveSuCantito(){

        Gorrion gorrion = new Gorrion(50, "pio pio");

        String canto = gorrion.cantar();

        assertEquals(canto, "pio pio");

    }

}
