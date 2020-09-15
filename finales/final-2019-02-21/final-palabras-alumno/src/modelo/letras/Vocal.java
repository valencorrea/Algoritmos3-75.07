package modelo.letras;

public class Vocal extends Letra {

    public Vocal(char letra, int peso) {
        super(letra, peso);
    }

    @Override
    public int calcularPuntaje() {
        return (this.peso * 2);
    }

}
