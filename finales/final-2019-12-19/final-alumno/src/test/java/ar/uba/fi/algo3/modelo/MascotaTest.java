package ar.uba.fi.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MascotaTest {

    @Test
    public void unaMascotaPaga150() {
        Mascota boni = new Mascota();
        assertEquals(150, boni.deuda());
    }

    @Test
    public void unaMascotaMuerdeUnaMaestraPaga300() {
        Mascota boni = new Mascota();
        boni.morderMaestra();
        assertEquals(300, boni.deuda());
    }

}
