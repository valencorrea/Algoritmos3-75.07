package modelo.tiposCocineros;

import modelo.comida.Comida;
import modelo.comida.empanadas.EmpanadaRegular;

public interface TipoCocinero {

     Comida hacerPan();

     Comida hacerEmpanada();
}
