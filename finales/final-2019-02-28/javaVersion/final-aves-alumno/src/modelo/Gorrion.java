package modelo;

public class Gorrion implements  Volador, Cantante{

    private String canto;
    private int velocidad;

    public Gorrion(int velocidad, String canto) {
        this.velocidad = velocidad;
        this.canto = canto;
    }

    @Override
    public int volar() {
        return this.velocidad;
    }

    @Override
    public String cantar() {
        return this.canto;
    }

}
