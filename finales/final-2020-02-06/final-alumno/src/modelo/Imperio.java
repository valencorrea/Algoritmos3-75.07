package modelo;

import java.util.LinkedList;

public class Imperio {

    private LinkedList<PlanetaTierra> planetas = new LinkedList();
    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {

    }

    public int getFondoAcumulado() {
        for(PlanetaTierra planeta: planetas){
            this.fondoAcumulado += (planeta.producir()/2);
        }
        return this.fondoAcumulado;
    }

    public void agregarPlaneta(PlanetaTierra tierra) {
        this.planetas.add(tierra);
    }

}
