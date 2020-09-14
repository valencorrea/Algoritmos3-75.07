package modelo.corredores;

public class Avestruz extends Corredor {

    public Avestruz(){
        this.velocidadPistaAtletismo = 70;
        this.velocidadHielo = 0;
        this.velocidadBarro = 70;
    }

    @Override
    public int correrEnPistaDeAtletismo() {
        return this.velocidadPistaAtletismo;
    }

    @Override
    public int correrEnBarro() {
        return this.velocidadBarro;
    }

    @Override
    public int correrEnHielo() {
        return this.velocidadHielo;
    }

}
