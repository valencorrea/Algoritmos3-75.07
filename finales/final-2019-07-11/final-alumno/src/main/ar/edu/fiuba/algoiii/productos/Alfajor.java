package main.ar.edu.fiuba.algoiii.productos;

import main.ar.edu.fiuba.algoiii.formasDePago.Vaca;

public class Alfajor {

    private int costo;
    private Vaca vaca;

    public Alfajor(int costo) {
        this.costo = costo;
    }

    public void asociarPrecioIndivudial(Vaca vaca) {
        this.vaca = vaca;
    }

    public double renta() {
        return this.vaca.renta();
    }
}
