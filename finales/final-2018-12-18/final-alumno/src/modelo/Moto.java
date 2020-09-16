package modelo;

public class Moto {

    private SinTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 2;

    public Moto(SinTelepase estadoTelepase) {
        this.estadoTelepase =  estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this);
    }

    public int pagarSinTelepase() {
        return (this.cantidadRuedas * this.precioPorRueda);
    }
}

