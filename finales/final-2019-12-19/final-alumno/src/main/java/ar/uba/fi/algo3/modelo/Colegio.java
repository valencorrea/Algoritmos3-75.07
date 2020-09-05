package ar.uba.fi.algo3.modelo;

import java.util.LinkedList;

public class Colegio implements Deudor{

    private LinkedList<Deudor> deudores = new LinkedList<Deudor>();
    private int deudaAcumulada = 0;

    public void anotar(Deudor deudor) {
        this.deudores.add(deudor);
    }

    @Override
    public int deuda() {
        for(Deudor deudor: deudores){
            this.deudaAcumulada += deudor.deuda();
        }
        return this.deudaAcumulada;
    }
}
