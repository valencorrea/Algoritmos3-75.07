package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Alumno implements Deudor{

    private String nombre;
    private String apellido;
    private LinkedList<Deudor> hermanos = new LinkedList<Deudor>();

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int deuda() {
        if (noTieneHermanos()) {
            return 100;
        }
        if(tieneUnHermano()){
            return 75;
        }
        return 0;
    }

    private boolean tieneUnHermano() {
        return (this.hermanos.size() == 1);
    }


    private boolean noTieneHermanos() {
        return (this.hermanos.isEmpty());
    }

    public void agregarHermano(Alumno alumno) {
        this.hermanos.add(alumno);
    }
}
