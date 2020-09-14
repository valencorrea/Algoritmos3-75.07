package modelo;

import modelo.superficies.Corredor;
import modelo.superficies.Superficie;

public class AbelPintos implements Corredor {

    private String cancion = "vas a verme llegar vas a oir mi cancion";

    public String cantar() {
        return this.cancion;
    }

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    public int correrEnPistaDeAtletismo() {
        return 15;
    }

    public int correrEnHielo() {
        return 0;
    }

    public int correrEnBarro() {
        return 2;
    }
}
