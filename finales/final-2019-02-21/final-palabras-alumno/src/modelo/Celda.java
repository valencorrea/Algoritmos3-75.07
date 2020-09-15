package modelo;

public class Celda {

    private char letra;
    private int peso;

    public Celda(char letra, int peso) {
        this.letra = letra;
        this.peso = peso;
    }

    public int calcularPeso() {
        return this.peso;
    }

    public int calcularPuntaje() {
        return this.peso;
    }
}
