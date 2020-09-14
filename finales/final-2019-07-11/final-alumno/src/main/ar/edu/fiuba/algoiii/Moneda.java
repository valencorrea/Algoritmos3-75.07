package main.ar.edu.fiuba.algoiii;

public interface Moneda {

    double rentaProductoIndividual(int precioProducto, int costoProducto);

    double rentaPromo(int valor, int costo);
}
