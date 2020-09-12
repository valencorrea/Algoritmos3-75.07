package modelo;

public class Pino extends Madera{

    private int kg;
    private int metros;
    private int precioPorKilo = 2;
    private int coefCalorico = 3;

    public Pino(int kg, int metros) {
        this.validarKg(kg);
        this.kg = kg;
        this.metros = metros;
    }

    @Override
    public int determinarGasto() {
        return ((this.metros * this.metros * this.kg) / this.coefCalorico);
    }
}
