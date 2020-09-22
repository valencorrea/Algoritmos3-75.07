package modelo;

public interface Carga {

    boolean puedoCargarmeEnMoto(Moto moto);

    boolean puedoCargarmeEnAuto(Auto auto, EstadoPortabici estadoPortabici);
}
