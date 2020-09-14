package modelo.superficies;

import modelo.corredores.Corredor;

public class PistaDeHielo implements Superficie {

    @Override
    public int correr(Corredor corredor) {
        return corredor.correrEnHielo();
    }

}
