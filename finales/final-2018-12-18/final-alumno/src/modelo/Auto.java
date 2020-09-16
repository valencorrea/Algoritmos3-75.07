package modelo;

public class Auto {

    private final TieneTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 4;

    public Auto(TieneTelepase estadoTelepase) {
        this.estadoTelepase = estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this);
    }

    public int pagarConTelepase() {
        return ((this.precioPorRueda * this.cantidadRuedas) / 2);
    }
}
