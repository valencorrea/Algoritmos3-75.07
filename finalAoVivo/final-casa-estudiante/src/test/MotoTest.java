package test;

import modelo.Helatodo;
import modelo.Moto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotoTest {

    @Test
    public void testUnaMotoDeberiaPoderDescargarUnHelatodo(){

        Moto moto = new Moto();
        Helatodo helatodo = new Helatodo();

        moto.cargar(helatodo);

        int cantidadCargas = moto.cantidadCargas();

        assertEquals(1, cantidadCargas);
    }

    @Test
    public void testUnaMotoCargaDosHelatodosSuCargamentoEsElIndicado(){

        Moto moto = new Moto();
        Helatodo unHelatodo = new Helatodo();
        Helatodo otroHelatodo = new Helatodo();

        moto.cargar(unHelatodo);
        moto.cargar(otroHelatodo);

        int cantidadCargas = moto.cantidadCargas();

        assertEquals(2, cantidadCargas);
    }

    @Test
    public void testUnaMotoSinCargamentoNoTieneCarga(){

        Moto moto = new Moto();

        int cantidadCargas = moto.cantidadCargas();

        assertEquals(0, cantidadCargas);
    }

    @Test
    public void unaMotoSinCargamentoQuiereDescargarNoPuede(){

        Moto moto = new Moto();

        try {
            moto.descargar();
            Assert.fail("No se arrojo exception al querer descargar una moto sin cargamento");
        } catch (RuntimeException exception) {
            assertEquals("No se puede descargar una moto sin cargamento", exception.getMessage());
        }
    }

    @Test
    public void testUnaMotoPuedeDescargarLuegoDeHaberCargadoUnHelatodo(){

        Moto moto = new Moto();
        Helatodo unHelatodo = new Helatodo();

        moto.cargar(unHelatodo);

        int cantidadCargas = moto.cantidadCargas();
        assertEquals(1, cantidadCargas);

        moto.descargar();

        cantidadCargas = moto.cantidadCargas();
        assertEquals(0, cantidadCargas);
    }

    @Test
    public void testLuegoDeCargarDosElementosYsacarUnoLaCantidadDeCargasEsLaCorrecta(){

        Moto moto = new Moto();
        Helatodo unHelatodo = new Helatodo();
        Helatodo otroHelatodo = new Helatodo();

        moto.cargar(unHelatodo);
        moto.cargar(otroHelatodo);

        int cantidadCargas = moto.cantidadCargas();
        assertEquals(2, cantidadCargas);

        moto.descargar();

        cantidadCargas = moto.cantidadCargas();
        assertEquals(1, cantidadCargas);
    }

}
