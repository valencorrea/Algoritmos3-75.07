package modelo;

public class InversionistaArriesgado implements Inversionista{

    private int monto;
    private Tipo tipo;

    public InversionistaArriesgado(Tipo tipo, int monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public int inversion() {
        return this.tipo.inversion(this);
    }

    @Override
    public int inversionTipo1() {
        return 0;
    }

    @Override
    public int inversionTipo0() {
        return this.monto * 2;
    }
}
