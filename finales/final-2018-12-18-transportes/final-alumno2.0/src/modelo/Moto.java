package modelo;

public class Moto extends Transporte{

    private PagadorSinTelepase tipoPagador;
    private int cantidadRuedas = 2;
    private int precioPorRuedas = 2;

    public Moto(PagadorSinTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    public int pagarPeaje() {
        return this.tipoPagador.pagarPeaje(this);
    }

    public int pagarSinTelepase() {
        return (this.cantidadRuedas * this.precioPorRuedas);
    }
}
