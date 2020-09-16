package test;

import modelo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonaCeliacaTest {

    @Test
    public void testPersonaCeliacaArrancaCon0CaloriasPorqueNoComioNada(){

        PersonaCeliaca persona = new PersonaCeliaca();

        int calorias = persona.calcularCalorias();

        assertEquals(calorias, 0);
    }

    @Test
    public void testPersonaCeliacaComePanSusCaloriasSon10(){

        PersonaCeliaca persona = new PersonaCeliaca();
        Panadero panadero = new Panadero(new TipoCocineroCeliaco());

        Pan pan = panadero.hacerPan();
        persona.comer(pan);

        int calorias = persona.calcularCalorias();

        assertEquals(calorias, 10);
    }


}

	/*
	@Test
	public void personaCeliacaComeCosasParaCeliacosEstaTodoBien() {

		Persona celiaco = new Persona(true);
		Assert.assertEquals(celiaco.calorias,0);

		PanaderoCeliaco panaderoCeliaco = new PanaderoCeliaco();
		String pan = panaderoCeliaco.hacerPan();
		celiaco.comer(pan);
		Assert.assertEquals(celiaco.calorias,10);

		EmpanaderoCeliaco empanderoCeliaco = new EmpanaderoCeliaco();
		String empanada = empanderoCeliaco.hacerEmpanada();
		celiaco.comer(empanada);
		Assert.assertEquals(celiaco.calorias,25);
	}
*/