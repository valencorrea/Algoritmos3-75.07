package test;

import modelo.Celda;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CeldaTest {

    @Test
    public void testCreoUnaCeldaYSuPesoEsElIndicado(){

        Celda celda = new Celda('A', 1);

        int peso = celda.calcularPeso();

        assertEquals(1, peso);
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
