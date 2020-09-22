package modelo.objetosCargables;

import modelo.Auto;
import modelo.Moto;
import modelo.estadoPortabici.EstadoPortabici;

public class Helatodo implements Carga{

    @Override
    public boolean puedoCargarmeEnMoto(Moto moto) {
        return true;
    }

    @Override
    public boolean puedoCargarmeEnAuto(Auto auto, EstadoPortabici estadoPortabici) {
        return true;
    }

}
