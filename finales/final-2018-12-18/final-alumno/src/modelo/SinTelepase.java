package modelo;

public class SinTelepase implements EstadoTelepase{

    @Override
    public int pagarPeaje(Transporte transporte) {
        return transporte.pagarSinTelepase();
    }
}
