package modelo.casas;

public class CasaDeCemento extends Casa {

    @Override
    public void soplarCasita() {
        this.casaDestruida = false;
    }

    @Override
    public void usarHachaEnCasita() {
        this.casaDestruida = false;
    }
}
