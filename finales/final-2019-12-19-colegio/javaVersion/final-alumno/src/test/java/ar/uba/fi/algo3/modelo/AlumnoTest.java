package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlumnoTest {

    @Test
    public void unAlumnoPagaCuotaCompleta()
    {
        Alumno a = new Alumno("unNombre", "unApellido");

        assertEquals(100, a.deuda());
    }

    @Test
    public void unAlmnoTieneUnHermanoEntoncesElHermanoPaga75PdeCuota() {//?? no hace lo que dice
        Alumno ova = new Alumno("ova", "unApellido");
        ova.agregarHermano(new Alumno("gaby", "sabatini"));

        assertEquals(75, ova.deuda());
    }

}
