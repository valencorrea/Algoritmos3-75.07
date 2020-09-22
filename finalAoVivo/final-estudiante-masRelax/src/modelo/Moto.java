package modelo;

import java.util.LinkedList;

public class Moto {

    private LinkedList<Helatodo> cargas = new LinkedList<Helatodo>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Helatodo helatodo) {
        helatodo.cargarmeEnMoto(this.cargas);
    }

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.removeLast();
    }

    public void verificacionDeCargamento() {
        if (cantidadCargas() == 0) {
            throw new RuntimeException("No se puede descargar una moto sin cargamento");
        }
    }

}
