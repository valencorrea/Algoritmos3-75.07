package modelo.transportes;

import modelo.pagadores.PagadorConTelepase;
import modelo.pagadores.PagadorSinTelepase;

public class Triciclo implements PagadorConTelepase, PagadorSinTelepase {

    private int cantidadRuedas = 3;
    private int precioPorRuedas = 2;

    @Override
    public int pagarPeajeConTelepase() {
        return 10;
    }

    @Override
    public int pagarPeajeSinTelepase() {
        return (this.cantidadRuedas * this.precioPorRuedas);
    }

}
