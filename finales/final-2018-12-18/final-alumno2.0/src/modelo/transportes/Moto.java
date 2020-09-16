package modelo.transportes;

import modelo.pagadores.PagadorSinTelepase;

public class Moto implements PagadorSinTelepase {

    private int cantidadRuedas = 2;
    private int precioPorRuedas = 2;

    public int pagarPeajeSinTelepase() {
        return (this.cantidadRuedas * this.precioPorRuedas);
    }

}
