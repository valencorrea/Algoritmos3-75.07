package main.ar.edu.fiuba.algoiii.productos;

import main.ar.edu.fiuba.algoiii.formasDePago.Precio;

public class Gaseosa extends Producto{

    private Precio precioIndividual;

    public Gaseosa(int costo) {
        this.costo = costo;
    }

    public void asociarPrecioIndivudial(Precio precio) {
        this.precioIndividual = precio;
    }

    public double renta() {
        return this.precioIndividual.renta(this.costo);
    }

}
