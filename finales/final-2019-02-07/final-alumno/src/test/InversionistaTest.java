package test;

import modelo.InversionistaArriesgado;
import modelo.InversionistaConservador;
import modelo.Tipo0;
import modelo.Tipo1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InversionistaTest {

    @Test
    public void testLaInversionDeUnInversionistaConservadorConTipo0EsLaEsperada(){

        InversionistaConservador inversionista = new InversionistaConservador(new Tipo0(100));

        int inversion = inversionista.inversion();

        assertEquals(200, inversion);
    }

    @Test
    public void testLaInversionDeUnInversionistaArriesgadoConTipo0EsLaEsperada(){

        InversionistaArriesgado inversionista = new InversionistaArriesgado(new Tipo0(100));

        int inversion = inversionista.inversion();

        assertEquals(200, inversion);
    }

    @Test
    public void testLaInversionDeUnInversionistaConservadorConTipo1EsLaEsperada(){

        InversionistaConservador inversionista = new InversionistaConservador(new Tipo1(100));

        int inversion = inversionista.inversion();

        assertEquals(100, inversion);
    }

}


/*
*

		Inversion inversion0 = new Inversion(0);
		Inversion inversion1 = new Inversion(1);

		int respuesta2 = inversion0.calcularPlata(100, new InversionistaArriesgado());
		if (respuesta2 != 200){
			pasoLaPrueba = false;
		}

		int respuesta3 = inversion1.calcularPlata(100, new InversionistaConservador());
		if (respuesta3 != 100){
			pasoLaPrueba = false;
		}

		int respuesta4 = inversion1.calcularPlata(100, new InversionistaArriesgado());
		if (respuesta4 != 300){
			pasoLaPrueba = false;
		}

		if (pasoLaPrueba){
			System.out.println("¡¡¡¡ PRUEBA SUPERADA :)  !!!!");
		}else{
			System.out.println("Error en el sistema");
		}
	}



}

*
* */