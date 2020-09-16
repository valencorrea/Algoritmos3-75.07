package modelo;

public class TipoCocineroRegular implements TipoCocinero{

    public PanRegular hacerPan() {
        return new PanRegular();
    }

    public EmpanadaRegular hacerEmpanada() {
        return new EmpanadaRegular();
    }
}
