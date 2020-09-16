package modelo;

public class InversionistaArriesgado {

    private Tipo tipo;

    public InversionistaArriesgado(Tipo tipo) {
        this.tipo = tipo;
    }

    public int inversion() {
        return this.tipo.inversion();
    }
}
