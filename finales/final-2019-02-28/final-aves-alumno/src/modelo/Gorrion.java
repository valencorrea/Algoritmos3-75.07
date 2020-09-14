package modelo;

public class Gorrion {

    private String canto;
    private int velocidad;

    public Gorrion(int velocidad, String canto) {
        this.velocidad = velocidad;
        this.canto = canto;
    }

    public int volar() {
        return this.velocidad;
    }

    public String cantar() {
        return this.canto;
    }
}
