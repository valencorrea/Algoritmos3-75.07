package modelo;

public class Auto extends VehiculoDeCarga{

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }
}
