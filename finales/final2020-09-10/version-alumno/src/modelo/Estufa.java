package modelo;

public class Estufa extends ComponenteElectrico{

    private final int precioKw;
    private final int ambientes;
    private final int calorias;

    public Estufa(int ambientes, int precioKw, int calorias) {
        this.ambientes = ambientes;
        this.precioKw = precioKw;
        this.calorias = calorias;
    }

    @Override
    public int gasto() {
        return (this.precioKw * this. ambientes * this.calorias);
    }
}
