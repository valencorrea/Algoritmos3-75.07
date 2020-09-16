package modelo.transportes;

import modelo.pagadores.PagadorConTelepase;
import modelo.pagadores.PagadorSinTelepase;

public class Camion implements PagadorSinTelepase, PagadorConTelepase {

    private int cantidadRuedas = 18;
    private int precioPorRueda = 2;

    @Override
    public int pagarPeajeConTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas) / 4;
    }

    @Override
    public int pagarPeajeSinTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas);
    }

}
