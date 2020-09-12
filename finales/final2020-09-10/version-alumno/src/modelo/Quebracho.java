package modelo;

public class Quebracho extends Madera{

    private int kg = 0;
    private int precioPorKilo = 4;
    private int pureza = 2;
    private int metros = 0;

    public Quebracho(int kg, int metros) {

        this.validarKg(kg);
        this.kg = kg;
        this.metros = metros;
    }

    public int determinarGasto() {
        return (this.metros * this.metros * this.pureza * this.precioPorKilo * this.kg);
    }
}
