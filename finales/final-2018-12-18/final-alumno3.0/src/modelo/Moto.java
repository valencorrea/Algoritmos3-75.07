package modelo;

public class Moto implements Transporte{

    private SinTelepase tipoPagador;
    private int cantidadRuedas = 2;
    private int precioPorRueda = 2;
    private int coeficienteTelepase = 0; //por default tiene 0

    public Moto(SinTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    @Override
    public int pagarPeaje() {
        return this.tipoPagador.pagar(this.cantidadRuedas, this.precioPorRueda, this.coeficienteTelepase);
    }
}
