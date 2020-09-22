package modelo;

import java.util.LinkedList;

public class Auto {

    private LinkedList<Carga> cargas = new LinkedList<Carga>();
    private EstadoPortabici estadoPortabici = new SinPortabici();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Carga carga) {
        if(carga.puedoCargarmeEnAuto(this, this.estadoPortabici)){
            this.cargas.add(carga);
        }
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
