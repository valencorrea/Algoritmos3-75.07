package main.ar.edu.fiuba.algoiii.productos;

public abstract class Producto {

    protected int costo;

    public int costo() {
        return this.costo;
    }

    public abstract double renta();

}