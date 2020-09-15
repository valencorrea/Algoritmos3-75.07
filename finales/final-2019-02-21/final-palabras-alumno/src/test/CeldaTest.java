package test;

import modelo.Celda;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CeldaTest {

    @Test
    public void testCreoUnaCeldaYSuPesoEsElIndicado(){

        Celda celda = new Celda('B', 1);

        int peso = celda.calcularPuntaje();

        assertEquals(1, peso);
    }

    @Test
    public void testQuieroCrearUnaCeldaPeroNoPuedoPorqueSuPesoEsMenorACero(){

        try {
            new Celda('A', -1);
            Assert.fail("No se arrojo exception al querer crear una celda con peso menor a 0");
        } catch (RuntimeException exception) {
            Assert.assertEquals("No se puede tener una celda con peso menor a 0", exception.getMessage());
        }
    }

    @Test
    public void testUnaCeldaContieneUnaVocalSeDuplicaSuPeso(){

        Celda celda = new Celda('A', 1);

        int peso = celda.calcularPuntaje();

        assertEquals(2, peso);

    }


}
