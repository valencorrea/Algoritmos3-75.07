package modelo.superficies;

public class SupDeBarro implements Superficie{

    @Override
    public int correr(Corredor corredor) {
        return corredor.correrEnBarro();
    }
}
