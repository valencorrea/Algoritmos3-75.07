package modelo.letras;

public class Caracter extends Letra{

    public Caracter(char caracter, int peso) {
        super(caracter, peso);
    }

    public int calcularPuntaje() {
        return this.peso;
    }
}
