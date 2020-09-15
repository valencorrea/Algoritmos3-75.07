package test;

import modelo.Celda;
import modelo.Palabra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalabraTest {

    @Test
    public void testCreoUnaPalabraConUnaCeldaDePeso1MeDevuelveElPuntajeEsperado(){

        Celda celda = new Celda('A', 1);
        Palabra palabra = new Palabra();

        palabra.agregarCelda(celda);

        int puntaje = palabra.calcularPuntaje();

        assertEquals(1, puntaje);
    }

    @Test
    public void testCreoUnaPalabraConDosCeldasDePesos1Y0MeDevuelveElPuntajeEsperado(){

        Celda unaCelda = new Celda('A', 0);
        Celda otraCelda = new Celda('G', 1);

        Palabra palabra = new Palabra();

        palabra.agregarCelda(unaCelda);
        palabra.agregarCelda(otraCelda);

        int puntaje = palabra.calcularPuntaje();

        assertEquals(1, puntaje);
    }

    @Test
    public void testCreoUnaPalabraConDosCeldasDePesos1y1MeDevuelveElPuntajeEsperado(){

        Celda unaCelda = new Celda('A', 1);
        Celda otraCelda = new Celda('G', 1);

        Palabra palabra = new Palabra();

        palabra.agregarCelda(unaCelda);
        palabra.agregarCelda(otraCelda);

        int puntaje = palabra.calcularPuntaje();

        assertEquals(2, puntaje);
    }

}

