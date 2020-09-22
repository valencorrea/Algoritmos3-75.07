package modelo;

import java.util.LinkedList;

public class Moto {

    private LinkedList<Carga> cargas = new LinkedList<Carga>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Carga carga) {
        carga.cargarmeEnMoto(this.cargas);
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
