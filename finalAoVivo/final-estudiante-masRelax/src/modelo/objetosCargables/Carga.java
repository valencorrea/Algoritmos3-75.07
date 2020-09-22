package modelo.objetosCargables;

import modelo.vehiculosDeCarga.Auto;
import modelo.vehiculosDeCarga.Moto;
import modelo.estadoPortabici.EstadoPortabici;

public interface Carga {

    boolean puedoCargarmeEnMoto(Moto moto);

    boolean puedoCargarmeEnAuto(Auto auto, EstadoPortabici estadoPortabici);
}
