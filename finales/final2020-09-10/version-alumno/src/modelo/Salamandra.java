package modelo;

public class Salamandra implements ComponenteElectrico{

    public Madera madera;

    @Override
    public int gasto() {
        this.verificarMadera();
        return this.madera.determinarGasto();
    }

    private void verificarMadera() {
        if(this.madera == null){
            throw new RuntimeException("No se puede calcular el precio de una salamandra a la cual no se le indico su madera");
        }
    }

    public void determinarMadera(Madera madera) {
        this.madera = madera;
    }
}
