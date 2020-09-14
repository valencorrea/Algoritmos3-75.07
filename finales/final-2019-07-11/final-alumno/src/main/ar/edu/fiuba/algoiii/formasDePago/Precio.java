package main.ar.edu.fiuba.algoiii.formasDePago;

import main.ar.edu.fiuba.algoiii.monedas.Moneda;

public class Precio {

    private int valor;
    private Moneda moneda;

    public Precio(int valor, Moneda moneda) {
        this.valor = valor;
        this.moneda = moneda;
    }

    public double renta(int costo) {
        return this.moneda.renta(this.valor, costo);
    }
}
