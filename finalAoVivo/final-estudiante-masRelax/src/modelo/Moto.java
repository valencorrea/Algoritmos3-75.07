package modelo;

import java.util.LinkedList;

public class Moto {

    private LinkedList<Carga> cargas = new LinkedList<Carga>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Carga carga) {
        if (carga.puedoCargarmeEnMoto(this)){
            this.cargas.add(carga);
        }
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

    public void agregarlePortabici() {
        throw new RuntimeException("No se puede agregar un portabici en una moto");
    }
}
