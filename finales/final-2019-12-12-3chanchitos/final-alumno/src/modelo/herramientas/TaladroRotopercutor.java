package modelo.herramientas;

import modelo.herramientas.Herramienta;
import modelo.personajes.Chanchitos;

public class TaladroRotopercutor implements Herramienta {

    @Override
    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        chanchitos.taladrarCasita();
    }
}
