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



/*
*
*  	// Tablero
        Celda celda_1_1 = new Celda();
        Celda celda_1_2 = new Celda();
        Celda celda_2_2 = new Celda();

        // Primera Palabra
        Palabra primera = new Palabra();
        *
        celda_1_1.setLetra("A");
        celda_1_1.setPeso(1);
        primera.celdas.add(celda_1_1);
        celda_1_2.setLetra("L");
        celda_1_2.setPeso(1);
        primera.celdas.add(celda_1_2);

        assertEquals(2, primera.puntaje());

        // Segunda palabra
        Palabra segunda = new Palabra();
        celda_1_2.setLetra("L");
        celda_1_2.setPeso(1);
        segunda.celdas.add(celda_1_2);
        celda_2_2.setLetra("O");
        celda_2_2.setPeso(1);
        segunda.celdas.add(celda_2_2);

        assertEquals(1, segunda.puntaje());

*
* */