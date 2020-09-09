package modelo.casas;

public class CasaDePaja extends Casa {

    @Override
    public void soplarCasita() {
        this.casaDestruida = true;
    }

    @Override
    public void usarHachaEnCasita() {
        this.casaDestruida = true;
    }

}
