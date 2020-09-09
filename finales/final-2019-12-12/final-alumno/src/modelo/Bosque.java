package modelo;

public class Bosque {

    private Chanchitos chanchitos;
    private Lobo lobo;

    public Bosque(Lobo lobo, Chanchitos chanchitos) {
        this.lobo = lobo;
        this.chanchitos = chanchitos;
    }

    public boolean casaDestruida() {
        return this.chanchitos.casaDestruida();
    }

    public void loboAtacarCasaDelChanchito() {
        this.lobo.atacarCasaDelChanchito(this.chanchitos);
    }

    public void huirHaciaUnaCasaDeMadera() {
        this.chanchitos.huirHaciaUnaCasaDeMadera();
    }

}
