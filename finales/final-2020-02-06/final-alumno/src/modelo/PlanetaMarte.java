package modelo;

public class PlanetaMarte extends Planeta{

    private int produccionPorHabitante;
    private int poblacion;

    public PlanetaMarte(int produccionPorHabitante, int poblaccion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblaccion;
    }

    public int producir() {
        return this.produccionPorHabitante * this.poblacion;
    }

}
