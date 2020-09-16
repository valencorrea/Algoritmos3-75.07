package modelo;

public class InversionistaConservador implements Inversionista{

    private Tipo tipo;

    public InversionistaConservador(Tipo tipo) {
        this.tipo = tipo;
    }

    public int inversion() {
        return this.tipo.inversion(this);
    }
}
