package main.ar.edu.fiuba.algoiii;

public class Gaseosa {

    private int precio;
    private int costo;
    private Pesos modena;

    public Gaseosa(int costo, int precio, Pesos moneda) {
        this.costo = costo;
        this.precio = precio;
        this.modena = moneda;
    }

    public double renta() {
        return 100.0;
    }
}
