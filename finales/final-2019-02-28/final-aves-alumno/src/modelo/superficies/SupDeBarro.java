package modelo.superficies;

import modelo.AbelPintos;

public class SupDeBarro implements Superficie{

    @Override
    public int correr(AbelPintos abelPintos) {
        return abelPintos.correrEnBarro();
    }
}
