package modelo.personajes;

import modelo.casas.Casa;
import modelo.casas.CasaDeCemento;
import modelo.casas.CasaDeMadera;
import modelo.casas.CasaDePaja;

public class Chanchitos {

    private Casa casita = new CasaDePaja();

    public boolean casaDestruida() {
        return this.casita.casaDestruida();
    }

    public void soplarCasita() {
        this.casita.soplarCasita();
    }

    public void usarHachaEnCasita() {
        this.casita.usarHachaEnCasita();
    }

    public void huirHaciaUnaCasaDeMadera() {
        this.casita = new CasaDeMadera();
    }


    public void huirHaciaUnaCasaDeCemento() {
        this.casita = new CasaDeCemento();
    }

    public void taladrarCasita() {
        this.casita.taladrarCasita();
    }
}
