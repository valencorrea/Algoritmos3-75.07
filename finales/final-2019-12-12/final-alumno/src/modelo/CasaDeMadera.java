package modelo;

public class CasaDeMadera implements Casa {

    private boolean casaDestruida = false;

    @Override
    public boolean casaDestruida() {
        return this.casaDestruida;
    }

    @Override
    public void loboAtacarCasita(Soplido ataque) {
        this.casaDestruida = ataque.puedeDestruirCasaDeMadera();
    }
}
