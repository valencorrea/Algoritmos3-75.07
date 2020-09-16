package modelo;

public class Tipo0 implements Tipo{

    private int monto;

    public Tipo0(int monto) {
        this.monto = monto;
    }

    public int inversion() {
        return monto * 2;
    }
}
