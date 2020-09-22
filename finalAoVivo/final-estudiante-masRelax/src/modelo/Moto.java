package modelo;

import modelo.objetosCargables.Carga;

public class Moto extends VehiculoDeCarga{

    public void cargar(Carga carga) {
        if(carga.puedoCargarmeEnMoto(this)){
            this.cargas.add(carga);
        }
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
