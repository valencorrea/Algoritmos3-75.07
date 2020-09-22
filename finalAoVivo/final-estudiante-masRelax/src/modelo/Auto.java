package modelo;

import java.util.LinkedList;

public class Auto {

    private LinkedList<Helatodo> cargas = new LinkedList<Helatodo>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Helatodo helatodo) {
        this.cargas.add(helatodo);
    }

    public void descargar() {
        this.cargas.remove();
    }
}
