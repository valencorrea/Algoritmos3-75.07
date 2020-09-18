package modelo;

public class Moto extends VehiculoDeCarga{

    public void cargar(Carga carga) {
        carga.cargarEnMoto(this.cargas);
    }

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar una moto sin cargamento");
        }
    }

    @Override
    public void agregarlePortabici() {
        throw new RuntimeException("No se puede agregar un portabici en la moto");
    }

}
