package modelo;

public class PlanetaTierra extends Planeta {

    private int poblacion;
    private int produccionPorHabitante;

    public PlanetaTierra(int produccionPorHabitante, int poblaccion) {
        this.produccionPorHabitante = produccionPorHabitante;
        this.poblacion = poblaccion;
    }

    public int producir() {
        return this.produccionPorHabitante * this.poblacion;
    }
}
