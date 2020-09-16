package modelo;

public class Auto implements Transporte{

    private final EstadoTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 4;

    public Auto(EstadoTelepase estadoTelepase) {
        this.estadoTelepase = estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this);
    }

    @Override
    public int pagarSinTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas);
    }

    @Override
    public int pagarConTelepase() {
        return ((this.precioPorRueda * this.cantidadRuedas) / 2);
    }
}
