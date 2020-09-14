package modelo;

public class AbelPintos {

    private String cancion = "vas a verme llegar vas a oir mi cancion";

    public String cantar() {
        return this.cancion;
    }

    public int correr(Superficie superficie) {
        return superficie.hacerCorrerAAbel(this);
    }
}
