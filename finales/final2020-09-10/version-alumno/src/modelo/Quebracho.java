package modelo;

public class Quebracho {

    private int kg = 0;
    private int precioPorKilo = 0;
    private int pureza = 0;
    private int metros = 0;

    public Quebracho(int kg, int pureza, int metros) {
        this.validarKg(kg);
        this.kg = kg;
        this.pureza = pureza;
        this.metros = metros;
    }

    private void validarKg(int kilos) {
        if(kilos >= 15){
            throw new RuntimeException("No se pueden exceder los 15 kg");
        }
    }

    public int determinarGasto() {
        return (this.metros * this.metros * this.pureza * this.precioPorKilo * this.kg);
    }
}
