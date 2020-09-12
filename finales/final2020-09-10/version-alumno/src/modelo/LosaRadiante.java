package modelo;

public class LosaRadiante implements ComponenteElectrico{

    private final int metros;
    private final int precioKw;

    public LosaRadiante(int metros, int precioKw) {
        this.metros = metros;
        this.precioKw = precioKw;
    }

    @Override
    public int gasto() {
        return (this.metros * this.metros * this.precioKw);
    }
}
