package test;

import modelo.Imperio;
import modelo.PlanetaMarte;
import modelo.PlanetaTierra;
import org.junit.Assert;
import org.junit.Test;

public class ImperioTest {

    @Test
    public void imperioSinPlanetasNoObtieneRemesaDeProduccion() {
        Imperio imperio = new Imperio();
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(0, imperio.getFondoAcumulado());
    }

    @Test
    public void imperioConUnPlanetaObtieneRemesaDeProduccionDeEsePlaneta() {

        Imperio imperio = new Imperio();
        PlanetaTierra tierra = new PlanetaTierra(10, 100);
        imperio.agregarPlaneta(tierra);

        // El Imperio se queda con la mitad de lo que produce el Planeta
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(500,  imperio.getFondoAcumulado());
    }

    @Test
    public void imperioConDosPlanetaObtieneRemesaDeProduccionDeTodosLosPlanetas() {

        Imperio imperio = new Imperio();
        PlanetaTierra tierra = new PlanetaTierra(10, 100);
        imperio.agregarPlaneta(tierra);

        PlanetaMarte marte = new PlanetaMarte(5, 10);
        imperio.agregarPlaneta(marte);

        // El Imperio recibe la mitad de lo que producen la tierra y marte
        imperio.solicitarRemesaDeProduccion();
        Assert.assertEquals(525, imperio.getFondoAcumulado());
    }
}
