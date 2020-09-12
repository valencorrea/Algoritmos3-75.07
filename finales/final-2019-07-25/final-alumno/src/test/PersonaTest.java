package test;

import modelo.*;
import modelo.comida.EmpanadaCeliaca;
import modelo.comida.EmpanadaNoCeliaca;
import modelo.comida.PanCeliaco;
import modelo.comida.PanNoCeliaco;
import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {


	/* Persona no celiaca */
	@Test
	public void unNoCeliacoArrancaTeniendo0CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 0);

	}

	@Test
	public void unNoCeliacoComePanNoCeliacoPasaATener10CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();

		PanaderoNoCeliaco panadero = new PanaderoNoCeliaco();
		PanNoCeliaco pan = panadero.hacerPan();
		personaNoCeliaca.comer(pan);
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 10);
		
	}

	@Test
	public void unNoCeliacoComeEmpanadaNoCeliacaPasaATener15CaloriasEnSuCuerpo() {

		PersonaNoCeliaca personaNoCeliaca = new PersonaNoCeliaca();

		EmpanaderoNoCeliaco empanadero = new EmpanaderoNoCeliaco();
		EmpanadaNoCeliaca empanada = empanadero.hacerEmpanada();
		personaNoCeliaca.comer(empanada);
		Assert.assertEquals(personaNoCeliaca.getCalorias(), 15);

	}


	/* Persona celiaca */
	@Test
	public void personaCeliacaArrancaTeniendo0CaloriasEnSuCuerpo() {

		PersonaCeliaca celiaco = new PersonaCeliaca();
		Assert.assertEquals(celiaco.getCalorias(), 0);

	}

	@Test
	public void unCeliacoComePanCeliacoPasaATener10CaloriasEnSuCuerpo() {

		PersonaCeliaca personaCeliaca = new PersonaCeliaca();

		PanaderoCeliaco panadero = new PanaderoCeliaco();
		PanCeliaco pan = panadero.hacerPan();
		personaCeliaca.comer(pan);
		Assert.assertEquals(personaCeliaca.getCalorias(), 10);

	}

	@Test
	public void unCeliacoComeEmpanadaCeliacaPasaATener15CaloriasEnSuCuerpo() {

		PersonaCeliaca personaCeliaca = new PersonaCeliaca();

		EmpanaderoCeliaco empanadero = new EmpanaderoCeliaco();
		EmpanadaCeliaca empanada = empanadero.hacerEmpanada();
		personaCeliaca.comer(empanada);
		Assert.assertEquals(personaCeliaca.getCalorias(), 15);

	}


	/* Nueva funcionalidad (master cheff) */
	@Test
	public void unMasterCheffLeCocinaAUnHipertensoYTiene10PorcientoMenosDeCalorias() {

		PersonaHipertensa personaHipertensa = new PersonaHipertensa();

		Mastercheff cocinero = new Mastercheff();
		PanHipertenso pan = cocinero.hacerPan();
		personaCeliaca.comer(pan);
		Assert.assertEquals(personaCeliaca.getCalorias(), 10);

	}

}
