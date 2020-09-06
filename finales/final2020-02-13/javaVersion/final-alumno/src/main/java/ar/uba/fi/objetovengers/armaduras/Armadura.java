package ar.uba.fi.objetovengers.armaduras;

import ar.uba.fi.objetovengers.IronMan;
import ar.uba.fi.objetovengers.Thanos;

public interface Armadura {

    int puntosAtaque();

    void atacar(Thanos thanos, IronMan ironMan);

}
