package tests;

import modelo.*;
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
    public void test04unaSalamandraDeQuebrachoYPureza2Y10MetrosCuesta3200() {

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
    public void test06unaSalamandraConQuebrachoSuperaLos15KilosTiraError() {

        try {
            Quebracho quebracho = new Quebracho(16,10);
            Assert.fail("No se arrojo exception al exceder los 15 kg de la salamandra");
        } catch (RuntimeException exception) {
            assertEquals("No se pueden exceder los 15 kg", exception.getMessage());
        }
    }


    /*
* Su productividad varía según el tipo de madera que se utilice
* Quebracho cuesta $4 el kg y tiene un grado de pureza 2. Calculo del gasto : metros cuadrados x kg x pureza
* Pino cuesta $2 el kg y tiene un coeficiente calórico de 3. Calculo del gasto: ( metros cuadrados x kg ) / coeficiente calorico
*
*  La Salamandra tiene una capacidad máxima de 15 kg que NO PUEDE SER EXCEDIDA.
*
* La Salamandra puede ser llenada 100% con Quebracho, 100% con Pino, o puede contener una parte de Pino y otra de Quebracho
* (El gasto total de la salamandra siempre será la suma de lo que gastan todas sus maderas)
*/

}