package modelo;

public abstract class Madera {

    public abstract int determinarGasto();

    void validarKg(int kilos) {
        if(kilos >= 15){
            throw new RuntimeException("No se pueden exceder los 15 kg");
        }
    }
}
