package modelo;

import java.util.LinkedList;

public class Casa {

    private LinkedList<ComponenteElectrico> componentesElectricos = new LinkedList<ComponenteElectrico>();

    public void comprarEstufa(int ambientes, int precioKw, int calorias) {
        this.guardarArtefacto(new Estufa(ambientes, precioKw, calorias));
    }

    public void comprarLosaRadiante(int metros, int precioKw) {
        this.guardarArtefacto(new LosaRadiante(metros, precioKw));
    }

    private void guardarArtefacto(ComponenteElectrico componente) {
        this.componentesElectricos.add(componente);
    }

    public int gastoTotal() {
        int precio = 0;

        for(ComponenteElectrico componente: this.componentesElectricos){
            precio += componente.gasto();
        }

        return precio;
    }



}
