package modelo;

public class Chanchitos {

    private Casa casita;

    public Chanchitos(){
        this.casita = new CasaDePaja();
    }

    public boolean casaDestruida() {
        return casita.casaDestruida();
    }

    public void loboAtacarCasita(Soplido ataque) {
        this.casita.loboAtacarCasita(ataque);
    }

    public void huirHaciaUnaCasaDeMadera() {
        this.casita = new CasaDeMadera();
    }
}
