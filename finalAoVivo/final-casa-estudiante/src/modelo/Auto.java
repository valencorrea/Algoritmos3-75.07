package modelo;

public class Auto extends VehiculoDeCarga{

    private EstadoPortabici estadoPortabici = new NoTienePortabici();

    public void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }

    @Override
    public void agregarlePortabici() {
        this.estadoPortabici = new TienePortabici();
    }

    public void cargar(Carga carga) {
        carga.cargarEnAuto(this.cargas, this.estadoPortabici);
    }
}
