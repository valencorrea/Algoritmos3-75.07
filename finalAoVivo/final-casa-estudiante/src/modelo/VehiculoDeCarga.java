package modelo;

import java.util.LinkedList;

public abstract class VehiculoDeCarga {

    protected LinkedList<Carga> cargas = new LinkedList<Carga>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Carga carga) {
        carga.cargarEnAuto(this.cargas);
    }

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.remove(this.cargas.size()-1);
    }

    protected abstract void verificacionDeCargamento();

}
