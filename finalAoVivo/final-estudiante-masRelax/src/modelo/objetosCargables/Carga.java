package modelo.objetosCargables;

import modelo.Auto;
import modelo.Moto;
import modelo.estadoPortabici.EstadoPortabici;

public interface Carga {

    boolean puedoCargarmeEnMoto(Moto moto);

    boolean puedoCargarmeEnAuto(Auto auto, EstadoPortabici estadoPortabici);
}
