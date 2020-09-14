package modelo.superficies;

import modelo.AbelPintos;
import modelo.Avestruz;

public class PistaAtletismo implements Superficie{

    public void correr(Avestruz avestruz) {
    }

    @Override
    public int correr(AbelPintos abelPintos) {
        return abelPintos.correrEnPistaDeAtletismo();
    }
}
