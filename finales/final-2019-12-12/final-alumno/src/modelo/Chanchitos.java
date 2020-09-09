package modelo;

public class Chanchitos {

    private Casa casita = new CasaDePaja();

    public boolean casaDestruida() {
        return this.casita.casaDestruida();
    }

    public void soplarCasita() {
        this.casita.soplarCasita();
    }
}
