package modelo;

import modelo.corredores.Corredor;
import modelo.superficies.Superficie;

public class Pinguino extends Corredor {

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public int correrEnPistaDeAtletismo() {
        return 0;
    }

    @Override
    public int correrEnBarro() {
        return 0;
    }

    @Override
    public int correrEnHielo() {
        return 5;
    }

    public int nadar() {
        return 20;
    }
}
