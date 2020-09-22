package modelo.vehiculosDeCarga;

import modelo.objetosCargables.Carga;
import java.util.LinkedList;

public abstract class VehiculoDeCarga {

    protected LinkedList<Carga> cargas = new LinkedList<Carga>();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public abstract void cargar(Carga carga);

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.remove();
    }

    public abstract void verificacionDeCargamento();

    public abstract void agregarlePortabici();

}
