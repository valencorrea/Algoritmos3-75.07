package modelo;

public class BichoRaro implements Transporte{

    private EstadoTelepase tipoPagador;
    private int cantidadRuedas = 5;
    private int precioPorRueda = 2;
    private int coeficienteTelepase = 1;

    public BichoRaro(EstadoTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    @Override
    public int pagarPeaje() {
        return this.tipoPagador.pagar(this.cantidadRuedas, this.precioPorRueda, this.coeficienteTelepase);
    }
}
