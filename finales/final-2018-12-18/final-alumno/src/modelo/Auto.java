package modelo;

public class Auto  {

    private EstadoTelepase estadoTelepase;
    private int precioPorRueda = 2;
    private int cantidadRuedas = 4;

    public Auto(EstadoTelepase estadoTelepase) {
        this.estadoTelepase = estadoTelepase;
    }

    public int pagarPeaje() {
        return this.estadoTelepase.pagarPeaje(this.precioPorRueda, this.cantidadRuedas);
    }
}
