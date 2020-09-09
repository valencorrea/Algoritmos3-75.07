package modelo.herramientas;

import modelo.personajes.Chanchitos;

public class Hacha implements Herramienta {

    @Override
    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        chanchitos.usarHachaEnCasita();
    }
}
