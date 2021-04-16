package modelo.casas;

public class CasaDeMadera extends Casa {

    @Override
    public void soplarCasita() {
        this.casaDestruida = false;
    }

    @Override
    public void usarHachaEnCasita() {
        this.casaDestruida = true;
    }

    @Override
    public void taladrarCasita() {
        this.casaDestruida = true;
    }
}
