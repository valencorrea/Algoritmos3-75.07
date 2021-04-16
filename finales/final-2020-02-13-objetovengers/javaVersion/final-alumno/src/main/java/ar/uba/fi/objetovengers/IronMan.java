package ar.uba.fi.objetovengers;

import ar.uba.fi.objetovengers.armaduras.Armadura;
import ar.uba.fi.objetovengers.armaduras.ArmaduraDeWarMachine;
import ar.uba.fi.objetovengers.armaduras.ArmaduraMarkI;
import ar.uba.fi.objetovengers.armaduras.ArmaduraMarkII;

import java.util.LinkedList;

public class IronMan {

    private int puntosVida = 100;
    private LinkedList<Armadura> armaduras = new LinkedList<Armadura>();

    public IronMan(Armadura unaArmadura) {
        this.armaduras.add(unaArmadura);
    }

    public double getPuntosDeVida() {
        return this.puntosVida;
    }

    public void recibirAtaque(int puntosAtaque) {
        this.puntosVida -= puntosAtaque;
    }

    public void atacar(Thanos thanos) {
        for(Armadura unaArmadura: this.armaduras) {
            unaArmadura.atacar(thanos, this);
        }
    }

    public void sumarVida(int puntosAtaque) {
        this.puntosVida += puntosAtaque;
    }

    public void agregarArmaduraMarkII() {
        this.armaduras.add(new ArmaduraMarkII());
    }

    public void agregarArmaduraDeWarMachine() {
        this.armaduras.add(new ArmaduraDeWarMachine());
    }

    public void agregarArmaduraMarkI() {
        this.armaduras.add(new ArmaduraMarkI());
    }
}
