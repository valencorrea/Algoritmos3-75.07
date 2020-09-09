package modelo;

public class Bosque {

    private Lobo lobo;
    private boolean casaDestruida = false;
    private CasaDePaja casita = new CasaDePaja();

    public Bosque(Lobo lobo) {
        this.lobo = lobo;
    }

    public boolean casaDestruida() {
        return this.casaDestruida;
    }

    public void loboAtacarCasaDelChanchito() {
//        this.lobo.atacarCasaDelChanchito(this.casita, this.casaDestruida);
            this.casaDestruida = true;
    }

    public void huirHaciaUnaCasaDeMadera() {
        this.casita = new CasaDeMadera();
        this.casaDestruida = false;
    }
}
