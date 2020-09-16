package modelo;

public class SinTelepase implements EstadoTelepase{

    @Override
    public int pagarPeaje(int precioPorRueda, int cantidadRuedas) {
        return (precioPorRueda * cantidadRuedas);
    }
}
