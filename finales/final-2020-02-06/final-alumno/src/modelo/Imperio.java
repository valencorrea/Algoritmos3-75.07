package modelo;

import java.util.LinkedList;

public class Imperio {

    private LinkedList<Planeta> planetas = new LinkedList();
    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {

    }

    public int getFondoAcumulado() {
        for(Planeta planeta: planetas){
            this.fondoAcumulado += (planeta.producir()/2);
        }
        return this.fondoAcumulado;
    }

    public void agregarPlaneta(Planeta planeta) {
        this.planetas.add(planeta);
    }

}
