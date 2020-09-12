package modelo;

public class CercoElectrico implements ComponenteElectrico {

    private int metros = 0;
    private int precioKw = 0;

    public CercoElectrico(int metros, int precioKw) {
        this.metros = metros;
        this.precioKw = precioKw;
    }

    @Override
    public int gasto() {
        return (this.metros * this.precioKw);
    }
}
