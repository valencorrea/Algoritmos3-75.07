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

    @Override
    public int correr(Superficie superficie) {
        return superficie.correr(this);
    }

    @Override
    public String cantar() {
        return this.cancion;
    }

    @Override
    public int correrEnPistaDeAtletismo() {
        return this.velocidadPistaAtletismo;
    }

    @Override
    public int correrEnHielo() {
        return this.velocidadHielo;
    }

    @Override
    public int correrEnBarro() {
        return this.velocidadBarro;
    }

}
