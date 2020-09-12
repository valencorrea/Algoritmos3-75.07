package modelo;

public class Estufa {

    private final int precioKw;
    private final int ambientes;
    private final int calorias;

    public Estufa(int ambientes, int precioKw, int calorias) {
        this.ambientes = ambientes;
        this.precioKw = precioKw;
        this.calorias = calorias;
    }

    public int gasto() {
        return (this.precioKw * this. ambientes * this.calorias);
    }
}
