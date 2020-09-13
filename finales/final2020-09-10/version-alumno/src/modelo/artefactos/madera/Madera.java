package modelo.artefactos.madera;

public abstract class Madera {

    public int kg;
    public int metros;

    public abstract int determinarGasto();

    public int kilos(){
        return this.kg;
    };
}
