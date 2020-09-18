package modelo;

public class Moto extends VehiculoDeCarga{

    @Override
    public void cargar(Carga carga) {
        carga.cargarEnMoto(this.cargas);
    }

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar una moto sin cargamento");
        }
    }
}
