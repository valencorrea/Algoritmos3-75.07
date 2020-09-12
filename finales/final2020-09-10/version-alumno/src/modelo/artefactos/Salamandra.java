package modelo.artefactos;

import modelo.artefactos.madera.Madera;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Salamandra implements ComponenteElectrico {

    public LinkedList<Madera> maderas = new LinkedList<Madera>();

    @Override
    public int gasto() {
        int gasto = 0;

        verificarMadera(this.maderas);
        for(Madera madera: this.maderas){
            gasto += madera.determinarGasto();
        }
        return gasto;
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
