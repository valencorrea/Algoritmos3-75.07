package tests;

import modelo.Casa;
import modelo.CercoElectrico;
import modelo.Estufa;
import modelo.LosaRadiante;
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


}