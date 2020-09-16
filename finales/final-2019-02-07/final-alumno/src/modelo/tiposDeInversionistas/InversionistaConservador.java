package modelo.tiposDeInversionistas;

import modelo.tiposDeInversion.Tipo;

public class InversionistaConservador implements Inversionista{

    private int monto;
    private Tipo tipo;

    public InversionistaConservador(Tipo tipo, int monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public int inversion() {
        return this.tipo.inversion(this);
    }

    @Override
    public int inversionTipo1() {
        return this.monto;
    }

    @Override
    public int inversionTipo0() {
        return this.monto * 2;
    }
}
