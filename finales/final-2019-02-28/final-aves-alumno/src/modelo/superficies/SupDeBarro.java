package modelo.superficies;

import modelo.corredores.Corredor;

public class SupDeBarro implements Superficie{

    @Override
    public int correr(Corredor corredor) {
        return corredor.correrEnBarro();
    }
}
