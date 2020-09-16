package modelo;

public class Tipo1 implements Tipo{

    private int monto;

    public Tipo1(int monto) {
        this.monto =  monto;
    }

    @Override
    public int inversion(Inversionista inversionistaArriesgado) {
        return 100;
    }
}
