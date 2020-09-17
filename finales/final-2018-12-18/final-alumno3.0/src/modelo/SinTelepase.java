package modelo;

public class SinTelepase implements EstadoTelepase{

    public int pagar(int cantidadRuedas, int precioPorRueda, int coeficienteTelepase) {
        return (cantidadRuedas * precioPorRueda);
    }

}
