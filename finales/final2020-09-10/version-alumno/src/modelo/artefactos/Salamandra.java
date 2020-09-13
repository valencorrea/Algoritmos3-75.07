package modelo.artefactos;

import modelo.artefactos.madera.Madera;

import java.util.LinkedList;

public class Salamandra implements ComponenteElectrico {

    public LinkedList<Madera> maderas = new LinkedList<Madera>();

    @Override
    public int gasto() {
        int gasto = 0;

        verificarMadera(this.maderas);
        verificarLimiteKilos(this.maderas);

        for(Madera madera: this.maderas){
            gasto += madera.determinarGasto();
        }
        return gasto;
    }

    private void verificarLimiteKilos(LinkedList<Madera> maderas) {
        int kilosTotales = 0;

        for(Madera madera: maderas){
            kilosTotales += madera.kilos();
        }

        if(kilosTotales >= 15){
            throw new RuntimeException("No se puede tener una salamandra con mas de 15 kg");
        }
    }

    private void verificarMadera(LinkedList<Madera> maderas) {
        if(maderas.isEmpty()){
            throw new RuntimeException("No se puede calcular el precio de una salamandra a la cual no se le indico su madera");
        }
    }

    public void determinarMadera(Madera madera) {
        this.maderas.add(madera);
    }

}
