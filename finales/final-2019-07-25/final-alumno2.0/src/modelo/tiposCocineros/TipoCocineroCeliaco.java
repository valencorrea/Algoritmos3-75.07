package modelo.tiposCocineros;

import modelo.comida.empanadas.EmpanadaCeliaca;
import modelo.comida.panes.PanCeliaco;

public class TipoCocineroCeliaco implements TipoCocinero {

    @Override
    public PanCeliaco hacerPan() {
        return (new PanCeliaco());
    }

    @Override
    public EmpanadaCeliaca hacerEmpanada() {
        return (new EmpanadaCeliaca());
    }

}
