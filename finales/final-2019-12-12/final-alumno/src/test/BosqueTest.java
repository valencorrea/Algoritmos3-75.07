package test;

import static org.junit.Assert.*;

import modelo.*;
import modelo.herramientas.Hacha;
import modelo.herramientas.Soplido;
import modelo.personajes.Chanchitos;
import modelo.personajes.Lobo;
import org.junit.Test;

public class BosqueTest {

	@Test
	public void test01creoUnBosqueYLaCasaNoEstaDestruida() {
		Bosque bosque = new Bosque(new Lobo(), new Chanchitos());

		assertFalse(bosque.casaDestruida());
	}

	@Test
	public void test02siElLoboAtacaSoplandoALaCasaDePajaSeDestruye() {
		Bosque bosque = new Bosque(new Lobo(), new Chanchitos());

		bosque.loboAtacarCasaDelChanchito();

		assertTrue(bosque.casaDestruida());
	}

	@Test
	public void test03chanchitosVanALaCasaDeMaderaYNoEstaDestruida() {
		Bosque bosque = new Bosque(new Lobo(), new Chanchitos());

		bosque.huirHaciaUnaCasaDeMadera();

		assertFalse(bosque.casaDestruida());
	}

	@Test
	public void test04loboQuiereDestruirCasaDeMaderaSoplandoNoPuede() {
		Bosque bosque = new Bosque(new Lobo(), new Chanchitos());

		bosque.huirHaciaUnaCasaDeMadera();
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test
	public void test05loboQuiereDestruirCasaDeMaderaConHachaPuede() {

		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo, new Chanchitos());

		lobo.cambiarHerramienta(new Hacha());

		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());
	}

	@Test
	public void test06chanchitosHuyenACasaDeCementoLoboConHachaNoPuedeDestruirla() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo, new Chanchitos());

		lobo.cambiarHerramienta(new Hacha());
		bosque.huirHaciaUnaCasaDeCemento();
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test
	public void test07chanchitosHuyenACasaDeCementoLoboSoplandoNoPuedeDestruirla() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo, new Chanchitos());

		bosque.huirHaciaUnaCasaDeCemento();
		bosque.loboAtacarCasaDelChanchito();

		assertFalse(bosque.casaDestruida());
	}

	@Test
	public void jueguemosEnElBosqueMientrasLoboNoEstaLoboEsta() {
		Lobo lobo = new Lobo();
		Bosque bosque = new Bosque(lobo, new Chanchitos());
		
		// 1. LA CASA NO ESTA DESTRUIDA
		assertFalse(bosque.casaDestruida());
		
		// 2. LOBO ATACA LA CASA SOPLANDO
		bosque.loboAtacarCasaDelChanchito();
		
		// 3. LA CASA ESTA DESTRUIDA
		assertTrue(bosque.casaDestruida());
		
		// 4. LOS CHANCHITOS HUYEN A LA CASA DE MADERA
		bosque.huirHaciaUnaCasaDeMadera();
		
		// 5. LA CASA DE MADERA NO ESTA DESTRUIDA
		assertFalse(bosque.casaDestruida());

		// 6. LOBO INTENTA DESTRUIR LA CASA DE MADERA SOPLANDO, NO LO LOGRA
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());

		// 7. LOBO CAMBIA DE HERRAMIENTA Y DESTRUYE LA CASA DE MADERA
		lobo.cambiarHerramienta(new Hacha());
		bosque.loboAtacarCasaDelChanchito();
		assertTrue(bosque.casaDestruida());

		// 8. LOS CHANCHITOS HUYEN A LA CASA DE CEMENTO
		bosque.huirHaciaUnaCasaDeCemento();


		// 9. LOBO NO PUEDE DESTRUIRLA
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());

		// 10. SOPLANDO MUCHO MENOS...
		lobo.cambiarHerramienta(new Soplido());
		bosque.loboAtacarCasaDelChanchito();
		assertFalse(bosque.casaDestruida());

	}
}
