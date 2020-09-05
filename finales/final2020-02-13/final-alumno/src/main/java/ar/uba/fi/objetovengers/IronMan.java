package ar.uba.fi.objetovengers;

public class IronMan {

    private Armadura armadura;
    private int puntosVida = 100;

    public IronMan(Armadura unaArmadura) {
        this.armadura = unaArmadura;
    }

    public double getPuntosDeVida() {
        return this.puntosVida;
    }

    public void recibirAtaque(int puntosAtaque) {
        this.puntosVida -= puntosAtaque;
    }

    public void atacar(Thanos thanos) {
        thanos.recibirAtaque(this.armadura.puntosAtaque());
    }
}
