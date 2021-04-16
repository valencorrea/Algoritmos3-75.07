package modelo;

public class ConTelepase implements EstadoTelepase{

    @Override
    public int pagar(int cantidadRuedas, int precioPorRueda, int coeficienteTelepase) {
        return (cantidadRuedas * precioPorRueda)/coeficienteTelepase;
    }

}
