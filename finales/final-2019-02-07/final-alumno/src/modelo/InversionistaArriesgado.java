package modelo;

public class InversionistaArriesgado implements Inversionista{

    private Tipo tipo;

    public InversionistaArriesgado(Tipo tipo) {
        this.tipo = tipo;
    }

    public int inversion() {
        return this.tipo.inversion(this);
    }
}
