package ar.uba.fi.objetovengers;

public class ArmaduraMarkII implements Armadura {

    private int puntosAtaque = 12;

    public int puntosAtaque() {
        return this.puntosAtaque;
    }

    public void atacar(Thanos thanos, IronMan ironMan) {
        thanos.recibirAtaque(this.puntosAtaque);
    }

}
