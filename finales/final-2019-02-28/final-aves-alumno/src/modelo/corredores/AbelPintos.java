package modelo.corredores;

public class AbelPintos extends Corredor {

    private String cancion = "vas a verme llegar vas a oir mi cancion";

    public AbelPintos(){
        this.velocidadPistaAtletismo = 15;
        this.velocidadBarro = 2;
        this.velocidadHielo = 0;
    }

    public String cantar() {
        return this.cancion;
    }

    public int correrEnPistaDeAtletismo() {
        return this.velocidadPistaAtletismo;
    }

    public int correrEnHielo() {
        return this.velocidadHielo;
    }

    public int correrEnBarro() {
        return this.velocidadBarro;
    }

}
