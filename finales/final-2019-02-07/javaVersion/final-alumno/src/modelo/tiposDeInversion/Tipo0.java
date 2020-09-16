package modelo.tiposDeInversion;

import modelo.tiposDeInversionistas.Inversionista;

public class Tipo0 implements Tipo{

    public int inversion(Inversionista inversionista) {
        return inversionista.inversionTipo0();
    }
}
