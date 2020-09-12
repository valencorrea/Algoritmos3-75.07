package modelo.artefactos.madera;

public class Pino extends Madera {

    public int precioPorKilo = 2;
    public int coefCalorico = 3;

    public Pino(int kg, int metros) {
        this.validarKg(kg);
        this.kg = kg;
        this.metros = metros;
    }

    @Override
    public int determinarGasto() {
        return ((this.metros * this.metros * this.kg * this.precioPorKilo) / this.coefCalorico);
    }

}
