package ar.uba.fi.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColegioTest {

	@Test
    public void conCuatroAlumnosNoHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        nacional.anotar( new Alumno("unNombre", "unApellido"));
        nacional.anotar( new Alumno("unNombre", "unApellido"));
        nacional.anotar( new Alumno("unNombre", "unApellido"));
        nacional.anotar( new Alumno("unNombre", "unApellido"));

        assertEquals(400, nacional.deudaAcumulada());
    }

    @Test
    public void conDosAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        nacional.anotar(gabi);
        Alumno ova = new Alumno("ova", "unApellido");
        ova.agregarHermano(gabi);
        nacional.anotar(ova);

        // Cuando hay dos hermanos, uno de ellos paga 25% menos
        assertEquals(175, nacional.deudaAcumulada());
    }

    @Test
    public void conTresAlumnosHermanosLaDeudaAcumuladaEsDeXXXPesos() {
        Colegio nacional = new Colegio();

        Alumno gabi = new Alumno("gabi", "sabatini");
        Alumno quique = new Alumno("quique", "unApellido");
        Alumno ova = new Alumno("ova", "unApellido");

        quique.agregarHermano(gabi);
        quique.agregarHermano(ova);

        nacional.anotar(quique);//tiene los 3 hermanos -> no paga
        nacional.anotar(gabi);//paga 100 normal
        nacional.anotar(ova);//paga 100 normal


        // Cuando hay tres hermanos, uno de ellos no paga
        assertEquals(200, nacional.deudaAcumulada());
    }

}
