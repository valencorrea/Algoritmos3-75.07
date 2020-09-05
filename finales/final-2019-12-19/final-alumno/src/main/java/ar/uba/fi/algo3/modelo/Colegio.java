package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Colegio implements Deudor{

    private LinkedList<Deudor> alumnos = new LinkedList<Deudor>();
    private int deudaAcumulada = 0;

    public void anotar(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override
    public int deuda() {
        for(Deudor alumno: alumnos){
            this.deudaAcumulada += alumno.deuda();
        }
        return this.deudaAcumulada;
    }
}
