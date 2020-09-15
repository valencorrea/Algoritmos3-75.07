package modelo;

public class Celda {

    private char letra;
    private int peso;

    public Celda(char letra, int peso) {
        verificacionDePeso(peso);
        this.letra = letra;
        this.peso = peso;
    }

    private void verificacionDePeso(int peso) {
        if(peso < 0){
            throw new RuntimeException("No se puede tener una celda con peso menor a 0");
        }
    }

    public int calcularPeso() {
        return this.peso;
    }

    public int calcularPuntaje() {
        return this.peso;
    }
}
