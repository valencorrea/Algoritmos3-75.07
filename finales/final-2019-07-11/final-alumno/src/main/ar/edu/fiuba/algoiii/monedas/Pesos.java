package main.ar.edu.fiuba.algoiii.monedas;

import main.ar.edu.fiuba.algoiii.monedas.Moneda;

public class Pesos implements Moneda {

    @Override
    public double renta(int precioProducto, int costoProducto) {
        return precioProducto - costoProducto;
    }
}
