package modelo.tiposDeInversion;

import modelo.tiposDeInversionistas.Inversionista;

public class Tipo1 implements Tipo{

    @Override
    public int inversion(Inversionista inversionista) {
        return inversionista.inversionTipo1();
    }
}
