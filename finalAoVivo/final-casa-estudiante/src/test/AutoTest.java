package test;

import modelo.Auto;
import modelo.Helatodo;
import modelo.Moto;
import org.junit.Assert;
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

    @Test
    public void testAutoConDosHelatodosSacoUnoMeQuedaElOtro(){

        Auto auto = new Auto();
        Helatodo helatodo = new Helatodo();
        Helatodo otroHelatodo = new Helatodo();

        auto.cargar(helatodo);
        auto.cargar(otroHelatodo);

        int cantidadCargas = auto.cantidadCargas();
        assertEquals(2, cantidadCargas);

        auto.descargar();

        cantidadCargas = auto.cantidadCargas();
        assertEquals(1, cantidadCargas);

    }

    @Test
    public void unAutoSinCargamentoQuiereDescargarNoPuede(){

        Auto auto = new Auto();

        try {
            auto.descargar();
            Assert.fail("No se arrojo exception al querer descargar un auto sin cargamento");
        } catch (RuntimeException exception) {
            assertEquals("No se puede descargar un auto sin cargamento", exception.getMessage());
        }
    }

}
