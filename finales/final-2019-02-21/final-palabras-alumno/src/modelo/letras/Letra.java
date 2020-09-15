package modelo.letras;

public abstract class Letra {

    protected char caracter;
    protected int peso;

    public Letra(char caracter, int peso) {
        verificacionDePeso(peso);
        this.caracter = caracter;
        this.peso = peso;
    }

    private void verificacionDePeso(int peso) {
        if (peso < 0) {
            throw new RuntimeException("No se puede tener una letra con peso menor a 0");
        }
    }

    public abstract int calcularPuntaje();

}