package modelo;

public class CasaDePaja {

    private boolean casaDestruida;

    public void loboAtacarCasita(Soplido ataque) {
        this.casaDestruida = ataque.puedeDestruirCasaDePaja();
    }

    public boolean casaDestruida() {
        return this.casaDestruida;
    }
}
