package main.ar.edu.fiuba.algoiii;

public class Dolares implements Moneda{

    @Override
    public double rentaProductoIndividual(int precioProducto, int costoProducto) {
        return (precioProducto * 50) - costoProducto;
    }

    @Override
    public double rentaPromo(int precioProducto, int costoProducto) {
        return (precioProducto * 50) - costoProducto;
    }

}
