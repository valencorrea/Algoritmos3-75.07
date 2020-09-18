package modelo.vehiculosDeCarga;

import modelo.cargas.Carga;
import modelo.estadoPortabici.TienePortabici;

import java.util.LinkedList;

public abstract class VehiculoDeCarga {

    protected LinkedList<Carga> cargas = new LinkedList<Carga>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.remove(this.cargas.size()-1);
    }

    public abstract void agregarlePortabici();

    protected abstract void verificacionDeCargamento();

}
