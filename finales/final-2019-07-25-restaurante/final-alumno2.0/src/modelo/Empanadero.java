package modelo;

import modelo.comida.Comida;
import modelo.comida.empanadas.EmpanadaRegular;
import modelo.tiposCocineros.TipoCocinero;
import modelo.tiposCocineros.TipoCocineroRegular;

public class Empanadero {

    private TipoCocinero tipoEmpanadero;

    public Empanadero(TipoCocinero regular) {
        this.tipoEmpanadero = regular;
    }

    public Comida hacerEmpanada() {
        return this.tipoEmpanadero.hacerEmpanada();
    }
}
