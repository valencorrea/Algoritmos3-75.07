package modelo;

public class Bici implements Carga{

    @Override
    public boolean puedoCargarmeEnMoto(Moto moto) {
        return false;
    }

    @Override
    public boolean puedoCargarmeEnAuto(Auto auto, EstadoPortabici estadoPortabici) {
        return estadoPortabici.puedoCargarBici();
    }
}
