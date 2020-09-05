package ar.uba.fi.objetovengers;

public class Thanos {

    private double puntosDeVida = 250;
    private int puntosAtaque = 15;

    public double getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void atacar(IronMan ironMan) {
        ironMan.recibirAtaque(this.puntosAtaque);
    }

    public void recibirAtaque(double puntosAtaque) {
        this.puntosDeVida -= puntosAtaque;
    }

    public void conseguirLasGemasDelInfinito() {
        this.puntosAtaque *= 4;
    }
}
