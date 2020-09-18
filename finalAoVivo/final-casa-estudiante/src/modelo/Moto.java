package modelo;

public class Moto extends VehiculoDeCarga{

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar una moto sin cargamento");
        }
    }
}
