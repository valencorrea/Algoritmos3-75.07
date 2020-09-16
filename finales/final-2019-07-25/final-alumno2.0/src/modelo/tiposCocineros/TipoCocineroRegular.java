package modelo.tiposCocineros;

import modelo.comida.empanadas.EmpanadaRegular;
import modelo.comida.panes.PanRegular;

public class TipoCocineroRegular implements TipoCocinero{

    public PanRegular hacerPan() {
        return new PanRegular();
    }

    public EmpanadaRegular hacerEmpanada() {
        return new EmpanadaRegular();
    }
}
