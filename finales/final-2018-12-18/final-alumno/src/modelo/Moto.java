package modelo;

public class Moto implements Transporte, PagadorSinTelepase{

    private EstadoTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 2;

    public Moto(EstadoTelepase estadoTelepase) {
        this.estadoTelepase =  estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this);
    }

    public int pagarSinTelepase() {
        return (this.cantidadRuedas * this.precioPorRueda);
    }

    @Override
    public int pagarConTelepase() {
        return 0;
    }

}

