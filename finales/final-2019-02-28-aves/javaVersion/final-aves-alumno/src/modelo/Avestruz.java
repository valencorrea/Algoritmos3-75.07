package modelo;

import modelo.superficies.Superficie;

public class Avestruz implements Corredor {

    private int velocidadPistaAtletismo= 70;
    private int velocidadBarro = 70;
    private int velocidadHielo = 0;

    @Override
    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int correrEnPistaDeAtletismo() {
        return this.velocidadPistaAtletismo;
    }

    @Override
    public int correrEnBarro() {
        return this.velocidadBarro;
    }

    @Override
    public int correrEnHielo() {
        return this.velocidadHielo;
    }

}
