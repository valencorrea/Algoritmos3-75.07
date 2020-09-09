package modelo;

public class Chanchitos {

    private Casa casita = new CasaDePaja();

    public boolean casaDestruida() {
        return this.casita.casaDestruida();
    }

    public void soplarCasita() {
        this.casita.soplarCasita();
    }

    public void huirHaciaUnaCasaDeMadera() {
        this.casita = new CasaDeMadera();
    }

    public void usarHachaEnCasita() {
        this.casita.usarHachaEnCasita();
    }

    public void huirHaciaUnaCasaDeCemento() {
        this.casita = new CasaDeCemento();
    }
}
