package tests;

import modelo.Casa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasaTest {

    @Test
    public void test01unaEstufaDe1ambiente10precioKwY1000CaloriasCuesta10000() {

        Casa casa = new Casa();
        casa.comprarEstufa(1, 10, 1000);

        int precio = casa.gastoTotal();

        assertEquals(10000, precio);
    }

    @Test
    public void test02unaLosaRadianteDe10metrosY10precioKwCuesta1000() {

        Casa casa = new Casa();
        casa.comprarLosaRadiante(10, 10);

        int precio = casa.gastoTotal();

        assertEquals(1000, precio);
    }



}
/*
*
        ComponenteElectrico losaComedor = new ComponenteElectrico("LOSA_RADIANTE");
        losaComedor.metros = 10;
        losaComedor.precioKw = 10;

        casa.losas.add(losaComedor);

        ComponenteElectrico cercoFondo = new ComponenteElectrico("CeRcO-ElEcTrIcO");
        cercoFondo.metros = 10;
        cercoFondo.precioKw = 10;

        casa.cercos.add(cercoFondo);

        org.junit.Assert.assertEquals(11100, casa.getGastoTotal());
*
* */