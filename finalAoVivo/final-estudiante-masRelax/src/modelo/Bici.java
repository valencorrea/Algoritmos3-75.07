package modelo;

public class Bici implements Carga{

    @Override
    public boolean puedoCargarmeEnMoto(Moto moto) {
        return false;
    }
}
