package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Alumno {

    private String nombre;
    private String apellido;
    private LinkedList<Alumno> hermanos = new LinkedList<Alumno>();

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

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
