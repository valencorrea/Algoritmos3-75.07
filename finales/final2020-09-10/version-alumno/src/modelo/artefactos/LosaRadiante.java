package modelo.artefactos;

public class LosaRadiante implements ComponenteElectrico {

    private int metros = 0;
    private int precioKw = 0;

    public LosaRadiante(int metros, int precioKw) {
        this.metros = metros;
        this.precioKw = precioKw;
    }

    @Override
    public int gasto() {
        return (this.metros * this.metros * this.precioKw);
    }
}
