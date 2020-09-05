package ar.uba.fi.objetovengers;

public class Thanos {

    private double puntosDeVida = 250;

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void atacar(IronMan ironMan) {
        ironMan.recibirAtaque(15);
    }

    public void recibirAtaque(int puntosAtaque) {
        this.puntosDeVida -= puntosAtaque;
    }
}
