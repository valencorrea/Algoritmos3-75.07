package modelo;

public class Auto implements PagadorSinTelepase, PagadorConTelepase{

    private int precioPorRueda = 2;
    private int cantidadRuedas = 4;

    public int pagarPeajeSinTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas);
    }

    public int pagarPeajeConTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas)/2;
    }
}
