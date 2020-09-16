package test;

import modelo.*;
import modelo.comida.Comida;
import modelo.comida.empanadas.EmpanadaRegular;
import modelo.personas.PersonaSinEnfermedades;
import modelo.tiposCocineros.TipoCocineroRegular;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonaSinEnfermedadesTest {

	@Test
	public void testPersonaNoCeliacaArrancaCon0CaloriasPorqueNoComioNada(){

		PersonaSinEnfermedades persona = new PersonaSinEnfermedades();

		int calorias = persona.calcularCalorias();

		assertEquals(calorias, 0);
	}

	@Test
	public void testPersonaNoCeliacaComePanSusCaloriasSon10(){

		PersonaSinEnfermedades persona = new PersonaSinEnfermedades();
		Panadero panadero = new Panadero(new TipoCocineroRegular());

		Comida pan = panadero.hacerPan();
		persona.comer(pan);

		int calorias = persona.calcularCalorias();

		assertEquals(calorias, 10);
	}

	@Test
	public void testPersonaNoCeliacaComeEmpanadaSusCaloriasSon15(){

		PersonaSinEnfermedades persona = new PersonaSinEnfermedades();
		Empanadero empanadero = new Empanadero(new TipoCocineroRegular());

		Comida empanada = empanadero.hacerEmpanada();
		persona.comer(empanada);

		int calorias = persona.calcularCalorias();

		assertEquals(calorias, 15);
	}
	// no seeeeeeeeeeeee

}
