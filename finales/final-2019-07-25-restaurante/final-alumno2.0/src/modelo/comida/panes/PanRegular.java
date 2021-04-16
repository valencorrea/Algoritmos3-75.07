package modelo.comida.panes;

import modelo.comida.Comida;

public class PanRegular implements Comida {

    @Override
    public int comer() {
        return 10;
    }

}
