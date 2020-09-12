package modelo;

public class Salamandra implements ComponenteElectrico{

    private Quebracho madera;

    @Override
    public int gasto() {
        return this.madera.determinarGasto();
    }

    public void determinarMadera(Quebracho quebracho) {
        this.madera = quebracho;
    }
}
