package modelo.estadoPortabici;

public class SinPortabici implements EstadoPortabici {

    @Override
    public boolean puedoCargarBici() {
        return false;
    }

}
