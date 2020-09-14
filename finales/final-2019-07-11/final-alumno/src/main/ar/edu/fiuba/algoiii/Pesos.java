package main.ar.edu.fiuba.algoiii;

public class Pesos implements Moneda{

    public double rentaProductoIndividual(int precioProducto, int costoProducto) {
        return precioProducto - costoProducto;
    }

    @Override
    public double rentaPromo(int precioProducto, int costoProducto) {
        return precioProducto - costoProducto;
    }
}
