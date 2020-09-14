package modelo.superficies;

import modelo.AbelPintos;

public class PistaDeHielo implements Superficie {

    @Override
    public int correr(AbelPintos abelPintos) {
        return abelPintos.correrEnHielo();
    }
}
