package ar.uba.fi.objetovengers;

public class ArmaduraMarkI implements Armadura {

    private int puntosAtaque = 10;

    public int puntosAtaque() {
        return this.puntosAtaque;
    }

    public void atacar(Thanos thanos, IronMan ironMan) {
        thanos.recibirAtaque(this.puntosAtaque());
    }

}
