package modelo.herramientas;

import modelo.personajes.Chanchitos;

public class Soplido implements Herramienta {

    @Override
    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        chanchitos.soplarCasita();
    }

}
