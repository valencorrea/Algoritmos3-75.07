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
        verificacionDeCargamento();
        this.cargas.remove();
    }

    public void verificacionDeCargamento() {
        if (cantidadCargas() == 0) {
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }

}
