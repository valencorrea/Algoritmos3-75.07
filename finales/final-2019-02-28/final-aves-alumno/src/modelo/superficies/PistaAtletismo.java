package modelo.superficies;

import modelo.Corredor;

public class PistaAtletismo implements Superficie{

    @Override
    public int correr(Corredor corredor) {
        return corredor.correrEnPistaDeAtletismo();
    }

}
