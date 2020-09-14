package modelo.corredores;

import modelo.superficies.Superficie;

public abstract class Corredor {

    protected int velocidadPistaAtletismo;
    protected int velocidadBarro;
    protected int velocidadHielo;

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    public abstract int correrEnPistaDeAtletismo();

    public abstract int correrEnBarro();

    public abstract int correrEnHielo();

}
