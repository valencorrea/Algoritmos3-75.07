package test;

import modelo.Helatodo;
import modelo.Moto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

}
