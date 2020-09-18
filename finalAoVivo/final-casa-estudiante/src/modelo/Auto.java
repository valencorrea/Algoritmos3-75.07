package modelo;

public class Auto extends VehiculoDeCarga{

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }

    @Override
    public void cargar(Carga carga) {
        carga.cargarEnAuto(this.cargas);
    }
}
