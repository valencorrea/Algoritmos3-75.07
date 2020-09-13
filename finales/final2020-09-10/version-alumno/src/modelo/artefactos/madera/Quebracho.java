package modelo.artefactos.madera;

public class Quebracho extends Madera {

    public int precioPorKilo = 4;
    public int pureza = 2;

    public Quebracho(int kg, int metros) {
        this.kg = kg;
        this.metros = metros;
    }

    @Override
    public int determinarGasto() {
        return (this.metros * this.metros * this.pureza * this.precioPorKilo * this.kg);
    }
}
