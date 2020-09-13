package tests;

import modelo.*;
import modelo.artefactos.CercoElectrico;
import modelo.artefactos.Estufa;
import modelo.artefactos.LosaRadiante;
import modelo.artefactos.Salamandra;
import modelo.artefactos.madera.Pino;
import modelo.artefactos.madera.Quebracho;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasaTest {

    @Test
    public void test01unaEstufaDe1ambiente10precioKwY1000CaloriasCuesta10000() {

        Casa casa = new Casa();

        Estufa estufa = new Estufa(1, 10, 1000);
        casa.comprarArtefacto(estufa);

        int precio = casa.gastoTotal();

        assertEquals(10000, precio);
    }

    @Test
    public void test02unaLosaRadianteDe10metrosY10precioKwCuesta1000() {

        Casa casa = new Casa();

        LosaRadiante losaRadiante = new LosaRadiante(10, 10);
        casa.comprarArtefacto(losaRadiante);

        int precio = casa.gastoTotal();

        assertEquals(1000, precio);
    }

    @Test
    public void test03unCercoElectricoDe10metrosY10precioKwCuesta100() {

        Casa casa = new Casa();

        CercoElectrico cerco = new CercoElectrico(10,10);
        casa.comprarArtefacto(cerco);

        int precio = casa.gastoTotal();

        assertEquals(100, precio);
    }

    @Test
    public void test04unaSalamandraDeQuebrachoY4KgY10MetrosCuesta3200() {

        Casa casa = new Casa();

        Salamandra salamandra = new Salamandra();
        salamandra.determinarMadera(new Quebracho(4, 10));
        casa.comprarArtefacto(salamandra);

        int precio = casa.gastoTotal();

        assertEquals(3200, precio);
    }

    @Test
    public void test05unaSalamandraSinMaderaNoPuedeCalcularSuPrecio() {

        Casa casa = new Casa();
        Salamandra salamandra = new Salamandra();
        casa.comprarArtefacto(salamandra);

        try {
            casa.gastoTotal();
            Assert.fail("No se arrojo exception al calcular precio de salamandra sin determinar su madera");
        } catch (RuntimeException exception) {
            assertEquals("No se puede calcular el precio de una salamandra a la cual no se le indico su madera", exception.getMessage());
        }
    }

    @Test
    public void test06unaSalamandraQuebrachoYPinoJuntanMasDe15KilosTiraError() {

        Casa casa = new Casa();

        Salamandra salamandra = new Salamandra();
        salamandra.determinarMadera(new Quebracho(8, 8));
        salamandra.determinarMadera(new Pino(40, 5));
        casa.comprarArtefacto(salamandra);

        try {
            int precio = casa.gastoTotal();
            Assert.fail("No se arrojo exception al exceder los 15 kg de la salamandra");
        } catch (RuntimeException exception) {
            assertEquals("No se puede tener una salamandra con mas de 15 kg", exception.getMessage());
        }
    }

    @Test
    public void test07unaSalamandraDePinoY8KgY8MetrosCuesta341() {

        Casa casa = new Casa();

        Salamandra salamandra = new Salamandra();
        salamandra.determinarMadera(new Pino(8, 8));
        casa.comprarArtefacto(salamandra);

        int precio = casa.gastoTotal();

        assertEquals(341, precio);
    }

    @Test
    public void test08unaSalamandraDePinoY8KgY8MetrosYQuebrachoCuesta4162() {

        Casa casa = new Casa();

        Salamandra salamandra = new Salamandra();
        salamandra.determinarMadera(new Quebracho(8, 8));
        salamandra.determinarMadera(new Pino(4, 5));
        casa.comprarArtefacto(salamandra);

        int precio = casa.gastoTotal();

        assertEquals(4162, precio);
    }

    @Test
    public void test09unaSalamandraDePinoDe4KgY2MetrosYQuebrachoDe10KgY8MetrosCuesta5130() {

        Casa casa = new Casa();

        Salamandra salamandra = new Salamandra();
        salamandra.determinarMadera(new Quebracho(10, 8));
        salamandra.determinarMadera(new Pino(4, 2));
        casa.comprarArtefacto(salamandra);

        int precio = casa.gastoTotal();

        assertEquals(5130, precio);
    }

}