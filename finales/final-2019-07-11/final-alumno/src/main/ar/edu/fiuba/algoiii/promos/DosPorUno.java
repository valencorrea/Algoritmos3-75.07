package main.ar.edu.fiuba.algoiii.promos;

import main.ar.edu.fiuba.algoiii.formasDePago.Precio;
import main.ar.edu.fiuba.algoiii.productos.Gaseosa;

import java.util.ArrayList;

public class DosPorUno {

    private int costo;
    private ArrayList<Gaseosa> productosEnPromo = new ArrayList<Gaseosa>();
    private Precio precioPromo;

    public DosPorUno(int costo) {
        this.costo = costo;
    }

    public void añadirProductos(Gaseosa gaseosa1, Gaseosa gaseosa2) {
        this.productosEnPromo.add(gaseosa1);
        this.productosEnPromo.add(gaseosa2);
    }

    public void asociarPrecioPromo(Precio precio) {
        this.precioPromo = precio;
    }

    public double renta() {
        return this.precioPromo.renta(this.costo);
    }

    public double costo() {
        int costo = 0;

        for(Gaseosa gaseosa: productosEnPromo){
            costo += gaseosa.costo();
        }

        return costo;
    }
}
