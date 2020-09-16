package modelo;

public class Tipo1 implements Tipo{

    @Override
    public int inversion(Inversionista inversionista) {
        return inversionista.inversionTipo1();
    }
}
