package modelo;

public class Auto implements Transporte{

    private EstadoTelepase tipoPagador;
    private int cantidadRuedas = 4;
    private int precioPorRueda = 2;
    private int coeficienteTelepase = 2;

    public Auto(EstadoTelepase tipoPagador) {
        this.tipoPagador = tipoPagador;
    }

    public int pagarPeaje(){
        return this.tipoPagador.pagar(this.cantidadRuedas, this.precioPorRueda, this.coeficienteTelepase);
    }
}
