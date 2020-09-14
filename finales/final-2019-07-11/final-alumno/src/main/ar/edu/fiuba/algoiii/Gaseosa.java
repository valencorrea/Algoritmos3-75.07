package main.ar.edu.fiuba.algoiii;

public class Gaseosa {

    private int costo;
    private Precio precioIndividual;

    public Gaseosa(int costo) {
        this.costo = costo;
    }

    public void asociarPrecioIndivudial(Precio precio) {
        this.precioIndividual = precio;
    }

    public double renta() {
        return this.precioIndividual.rentaProductoIndividual(this.costo);
    }
}
