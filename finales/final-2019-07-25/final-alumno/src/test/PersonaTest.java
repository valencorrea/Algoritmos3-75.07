package test;

import modelo.*;
import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

	@Test
	public void unNoCeliacoArrancaTeniendo0CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 0);

	}

	@Test
	public void unNoCeliacoComePanNoCeliacoPasaATener10CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();

		Panadero panadero = new Panadero();
		PanNoCeliaco pan = panadero.hacerPan();
		personaNoCeliaca.comer(pan);
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 10);
		
	}

	@Test
	public void unNoCeliacoComeEmpanadaNoCeliacaPasaATener10CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();

		Empanadero empanadero = new Empanadero();
		EmpanadaNoCeliaca empanada = empanadero.hacerEmpanada();
		personaNoCeliaca.comer(empanada);
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 15);

	}

}
