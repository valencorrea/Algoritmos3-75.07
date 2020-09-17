package modelo;

public class Camion implements Transporte {

    private EstadoTelepase tipoPagador;
    private int cantidadRuedas = 18;
    private int precioPorRueda = 2;
    private int coeficienteTelepase = 4;

    public Camion(EstadoTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    @Override
    public int pagarPeaje() {
        return this.tipoPagador.pagar(this.cantidadRuedas, this.precioPorRueda, this.coeficienteTelepase);
    }

}
