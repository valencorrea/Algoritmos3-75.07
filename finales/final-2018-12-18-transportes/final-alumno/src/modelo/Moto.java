package modelo;

public class Moto {

    private EstadoTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 2;

    public Moto(EstadoTelepase estadoTelepase) {
        this.estadoTelepase =  estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this.precioPorRueda, this.cantidadRuedas);
    }

}

