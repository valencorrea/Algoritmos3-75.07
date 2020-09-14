package modelo;

import modelo.superficies.Superficie;

public class AbelPintos implements Corredor, Cantante {

    protected int velocidadPistaAtletismo;
    protected int velocidadBarro;
    protected int velocidadHielo;

    private String cancion = "vas a verme llegar vas a oir mi cancion";

    public AbelPintos(){
        this.velocidadPistaAtletismo = 15;
        this.velocidadBarro = 2;
        this.velocidadHielo = 0;
    }

    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
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
