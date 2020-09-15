package modelo.estadosCelda;

import modelo.estadosCelda.EstadoCelda;
import modelo.letras.Letra;

public class EstadoContabilizada implements EstadoCelda {

    @Override
    public int calcularPuntaje(Letra letra) {
        return 0;
    }

}
