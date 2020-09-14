package main.ar.edu.fiuba.algoiii;

public class Dolares implements Moneda{

    @Override
    public double renta(int precioProducto, int costoProducto) {
        return (precioProducto * 50) - costoProducto;
    }
}
