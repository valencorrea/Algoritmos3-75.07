package modelo;

public class Lobo {

    private Soplido ataque = new Soplido();

    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        chanchitos.loboAtacarCasita(this.ataque);
    }
}
