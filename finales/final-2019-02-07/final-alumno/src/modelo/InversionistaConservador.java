package modelo;

public class InversionistaConservador {

    private Tipo tipo;

    public InversionistaConservador(Tipo tipo) {
        this.tipo = tipo;
    }

    public int inversion() {
        return this.tipo.inversion();
    }
}
