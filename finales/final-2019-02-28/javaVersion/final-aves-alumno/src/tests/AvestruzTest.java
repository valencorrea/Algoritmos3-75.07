package tests;

import modelo.Avestruz;
import modelo.superficies.PistaAtletismo;
import modelo.superficies.PistaDeHielo;
import modelo.superficies.SupDeBarro;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AvestruzTest {

    @Test
    public void testUnAvestruzEnUnaPistaDeAtletismoCorreA70KmPorHora(){

        Avestruz avestruz = new Avestruz();

        int velocidad = avestruz.correr(new PistaAtletismo());

        assertEquals(velocidad, 70);

    }

    @Test
    public void testUnAvestruzEnUnaPistaDeHieloNiSeMueve(){

        Avestruz avestruz = new Avestruz();

        int velocidad = avestruz.correr(new PistaDeHielo());

        assertEquals(velocidad, 0);

    }

    @Test
    public void testUnAvestruzEnUnaSuperficieDeBarroCorreA70KmPorHora(){

        Avestruz avestruz = new Avestruz();

        int velocidad = avestruz.correr(new SupDeBarro());

        assertEquals(velocidad, 70);

    }

}
