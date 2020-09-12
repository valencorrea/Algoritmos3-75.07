package modelo;

import modelo.artefactos.ComponenteElectrico;

import java.util.LinkedList;

public class Casa {

    private LinkedList<ComponenteElectrico> componentesElectricos = new LinkedList<ComponenteElectrico>();

    public int gastoTotal() {
        int precio = 0;

        for(ComponenteElectrico componente: this.componentesElectricos){
            precio += componente.gasto();
        }

        return precio;
    }

    public void comprarArtefacto(ComponenteElectrico artefacto) {
        this.componentesElectricos.add(artefacto);
    }
}
