package modelo.artefactos;

public class Estufa implements ComponenteElectrico {

    private int precioKw = 0;
    private int ambientes = 0;
    private int calorias = 0;

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
