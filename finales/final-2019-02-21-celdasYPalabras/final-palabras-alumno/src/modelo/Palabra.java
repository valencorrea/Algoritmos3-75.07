package modelo;

import java.util.LinkedList;

public class Palabra {

    private LinkedList<Celda> celdas = new LinkedList<Celda>();

    public void agregarCelda(Celda celda) {
        this.celdas.add(celda);
    }

    public int calcularPuntaje() {
        int puntaje = 0;

        for(Celda celda: this.celdas){
            puntaje += celda.calcularPuntaje();
        }

        return puntaje;
    }
}
