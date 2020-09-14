package modelo.superficies;

public class PistaDeHielo implements Superficie {

    @Override
    public int correr(Corredor corredor) {
        return corredor.correrEnHielo();
    }
}
