package test;

import modelo.Auto;
import modelo.Helatodo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoTest {

    @Test
    public void testUnAutoSinCargamentoNoTieneCargamento(){

        Auto auto = new Auto();

        int cantidadCargas = auto.cantidadCargas();

        assertEquals(0, cantidadCargas);
    }

    @Test
    public void testAutoConUnHelatodoTieneUnElementoCargado(){

        Auto auto = new Auto();
        Helatodo helatodo = new Helatodo();

        auto.cargar(helatodo);

        int cantidadCargas = auto.cantidadCargas();

        assertEquals(1, cantidadCargas);
    }

}
