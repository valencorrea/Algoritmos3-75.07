package modelo;

import java.util.LinkedList;

public class Auto {

    private LinkedList cargas = new LinkedList();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Helatodo carga) {
        carga.cargarEnAuto(this.cargas);
    }
}
