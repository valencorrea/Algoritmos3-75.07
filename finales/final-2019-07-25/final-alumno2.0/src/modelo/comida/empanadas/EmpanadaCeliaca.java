package modelo.comida.empanadas;

import modelo.comida.Comida;

public class EmpanadaCeliaca implements Comida {

    @Override
    public int comer() {
        return 15;
    }
}
