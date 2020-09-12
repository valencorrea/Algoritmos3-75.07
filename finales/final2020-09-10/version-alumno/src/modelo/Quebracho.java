package modelo;

public class Quebracho {

    private int precioPorKilo = 0;
    private int pureza = 0;
    private int metros = 0;

    public Quebracho(int precioPorKilo, int pureza, int metros) {
        this.precioPorKilo = precioPorKilo;
        this.pureza = pureza;
        this.metros = metros;
    }

    public int determinarGasto() {
        return (this.metros * this.metros * this.pureza * this.precioPorKilo);
    }
}
