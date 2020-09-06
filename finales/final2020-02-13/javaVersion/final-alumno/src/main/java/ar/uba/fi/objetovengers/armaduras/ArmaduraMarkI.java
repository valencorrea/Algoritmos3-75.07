package ar.uba.fi.objetovengers.armaduras;

import ar.uba.fi.objetovengers.IronMan;
import ar.uba.fi.objetovengers.Thanos;
import ar.uba.fi.objetovengers.armaduras.Armadura;

public class ArmaduraMarkI implements Armadura {

    private int puntosAtaque = 10;

    public int puntosAtaque() {
        return this.puntosAtaque;
    }

    public void atacar(Thanos thanos, IronMan ironMan) {
        thanos.recibirAtaque(this.puntosAtaque());
    }

}
