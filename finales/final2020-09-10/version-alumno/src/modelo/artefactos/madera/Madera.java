package modelo.artefactos.madera;

public abstract class Madera {

    public int kg = 0;
    public int metros = 0;

    public abstract int determinarGasto();

    public void validarKg(int kilos) {
        if(kilos >= 15){
            throw new RuntimeException("No se pueden exceder los 15 kg");
        }
    }
}
