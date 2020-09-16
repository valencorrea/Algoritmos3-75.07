package modelo;

public class TieneTelepase implements EstadoTelepase {

    public int pagarPeaje(Transporte transporte) {
        return transporte.pagarConTelepase();
    }

}
