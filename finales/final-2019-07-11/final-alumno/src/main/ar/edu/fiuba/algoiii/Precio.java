package main.ar.edu.fiuba.algoiii;

public class Precio {

    private int valor;
    private Moneda moneda;

    public Precio(int valor, Moneda moneda) {
        this.valor = valor;
        this.moneda = moneda;
    }

    public double rentaProductoIndividual(int costo) {
        return this.moneda.rentaProductoIndividual(this.valor, costo);
    }
}
