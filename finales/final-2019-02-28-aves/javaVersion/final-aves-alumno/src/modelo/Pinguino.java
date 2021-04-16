package modelo;

import modelo.superficies.Superficie;

public class Pinguino implements Corredor, Nadador {

    private int velocidadHielo = 20;
    private int velocidadEnAtletismo = 0;
    private int velocidadEnBarro = 0;

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int correrEnPistaDeAtletismo() {
        return this.velocidadEnAtletismo;
    }

    @Override
    public int correrEnBarro() {
        return this.velocidadEnBarro;
    }

    @Override
    public int correrEnHielo() {
        return this.velocidadHielo;
    }

    @Override
    public int nadar() {
        return 20;
    }
}
