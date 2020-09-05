package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Colegio {

    private LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
    private int deudaAcumulada = 0;

    public void anotar(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public int deudaAcumulada() {
        for(Alumno alumno: alumnos){
            this.deudaAcumulada += alumno.deuda();
        }
        return this.deudaAcumulada;
    }
}
