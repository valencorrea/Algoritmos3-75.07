package ar.uba.fi.algo3.modelo;

public class Mascota implements Deudor{

    private int deuda = 150;

    @Override
    public int deuda() {
        return this.deuda;
    }

    public void morderMaestra() {
        this.deuda *= 2;
    }
}
