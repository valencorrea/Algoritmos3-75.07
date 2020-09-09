package modelo.personajes;

import modelo.herramientas.Herramienta;
import modelo.herramientas.Soplido;

public class Lobo {

    private Herramienta herramienta = new Soplido();

    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        this.herramienta.atacarCasaDelChanchito(chanchitos);
    }

    public void cambiarHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }
}
