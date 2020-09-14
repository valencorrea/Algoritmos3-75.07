package modelo;

import modelo.superficies.Corredor;
import modelo.superficies.Superficie;

public class AbelPintos implements Corredor {

    private int velocidadPistaAtletismo = 15;
    private int velocidadBarro = 2;
    private int velocidadHielo = 0;
    private String cancion = "vas a verme llegar vas a oir mi cancion";

    public String cantar() {
        return this.cancion;
    }

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    public int correrEnPistaDeAtletismo() {
        return this.velocidadPistaAtletismo;
    }

    public int correrEnHielo() {
        return this.velocidadHielo;
    }

    public int correrEnBarro() {
        return this.velocidadBarro;
    }

}
