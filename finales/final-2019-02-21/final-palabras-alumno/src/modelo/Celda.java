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

    public int calcularPuntaje() {
        return puntajeSegunLetra();
    }

    private int puntajeSegunLetra() {
        if(esVocal()){
            return puntajeParaVocal();
        }
        return puntajeParaConsonante();
    }

    private int puntajeParaConsonante() {
        return this.peso;
    }

    private int puntajeParaVocal() {
        return (this.peso * 2);
    }

    private boolean esVocal() {
        if(this.letra == 'A' || this.letra == 'E' || this.letra == 'I' ||this.letra == 'O' || this.letra == 'U'){
            return true;
        }
        return false;
    }
}
