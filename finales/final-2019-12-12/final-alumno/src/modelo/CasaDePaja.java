package modelo;

public class CasaDePaja implements Casa {

    private boolean casaDestruida = false;

    public void loboAtacarCasita(Soplido ataque) {
        this.casaDestruida = ataque.puedeDestruirCasaDePaja();
    }

    public boolean casaDestruida() {
        return this.casaDestruida;
    }
}
