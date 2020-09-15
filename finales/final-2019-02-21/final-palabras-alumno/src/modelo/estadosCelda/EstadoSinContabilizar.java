package modelo.estadosCelda;

import modelo.estadosCelda.EstadoCelda;
import modelo.letras.Letra;

public class EstadoSinContabilizar implements EstadoCelda {

    @Override
    public int calcularPuntaje(Letra letra) {
        return letra.calcularPuntaje();
    }

}
