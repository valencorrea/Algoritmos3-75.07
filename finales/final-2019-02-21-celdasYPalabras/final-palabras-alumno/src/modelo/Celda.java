package modelo;

import modelo.estadosCelda.EstadoCelda;
import modelo.estadosCelda.EstadoContabilizada;
import modelo.estadosCelda.EstadoSinContabilizar;
import modelo.letras.Letra;

public class Celda {

    private EstadoCelda estadoCelda = new EstadoSinContabilizar();
    private Letra letra;

    public Celda(Letra letra) {
        this.letra = letra;
    }

    public int calcularPuntaje() {
        int puntaje = this.estadoCelda.calcularPuntaje(this.letra);
        this.estadoCelda = new EstadoContabilizada();

        return puntaje;
    }

}
