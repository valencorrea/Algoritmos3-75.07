package modelo;

public class Chanchitos {

    private CasaDePaja casita = new CasaDePaja();

    public boolean casaDestruida() {
        return casita.casaDestruida();
    }

    public void loboAtacarCasita(Soplido ataque) {
        this.casita.loboAtacarCasita(ataque);
    }
}
