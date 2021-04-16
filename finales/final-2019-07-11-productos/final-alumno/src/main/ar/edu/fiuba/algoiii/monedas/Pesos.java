package main.ar.edu.fiuba.algoiii.monedas;
public class Pesos implements Moneda {

    @Override
    public double renta(int precioProducto, int costoProducto) {
        return precioProducto - costoProducto;
    }
}
