package modelo.vehiculosDeCarga;

import modelo.estadoPortabici.ConPortabici;
import modelo.estadoPortabici.EstadoPortabici;
import modelo.estadoPortabici.SinPortabici;
import modelo.objetosCargables.Carga;

public class Auto extends VehiculoDeCarga{

    private EstadoPortabici estadoPortabici = new SinPortabici();

    public void cargar(Carga carga) {
        if(carga.puedoCargarmeEnAuto(this, this.estadoPortabici)){
            this.cargas.add(carga);
        }
    }

    public void verificacionDeCargamento() {
        if (cantidadCargas() == 0) {
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }

    public void agregarlePortabici() {
        this.estadoPortabici = new ConPortabici();
    }

}
