package main.ar.edu.fiuba.algoiii.promos;

import main.ar.edu.fiuba.algoiii.formasDePago.Precio;
import main.ar.edu.fiuba.algoiii.productos.Producto;

import java.util.ArrayList;

public class DosPorUno {

    private int costo;
    private ArrayList<Producto> productosEnPromo = new ArrayList<Producto>();
    private Precio precioPromo;

    public DosPorUno(int costo) {
        this.costo = costo;
    }

    public void añadirProductos(Producto producto1, Producto producto2) {
        this.productosEnPromo.add(producto1);
        this.productosEnPromo.add(producto2);
    }

    public void asociarPrecioPromo(Precio precio) {
        this.precioPromo = precio;
    }

    public double renta() {
        return this.precioPromo.renta(this.costo);
    }

    public double costo() {
        int costo = 0;

        for(Producto producto: productosEnPromo){
            costo += producto.costo();
        }

        return costo;
    }
}
