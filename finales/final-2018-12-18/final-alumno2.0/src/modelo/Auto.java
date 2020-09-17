package modelo;

public class Auto extends Transporte{

    private PagadorSinTelepase tipoPagador;

    public Auto(PagadorSinTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    @Override
    public int pagarPeaje() {
        return this.tipoPagador.pagarPeaje(this);
    }

/*
    private int precioPorRueda = 2;
    private int cantidadRuedas = 4;

    public int pagarPeajeSinTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas);
    }

    public int pagarPeajeConTelepase() {
        return (this.precioPorRueda * this.cantidadRuedas)/2;
    }
*/
}
