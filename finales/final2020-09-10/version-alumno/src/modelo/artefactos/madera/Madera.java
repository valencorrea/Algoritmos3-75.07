package modelo.artefactos.madera;

public abstract class Madera {

    public int metros = 0;
    protected int kilos;

    public abstract int determinarGasto();

    public abstract int kilos();
}
