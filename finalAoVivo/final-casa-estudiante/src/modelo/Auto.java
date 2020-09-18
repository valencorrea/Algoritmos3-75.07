package modelo;

import java.util.LinkedList;

public class Auto {

    private LinkedList cargas = new LinkedList();

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void cargar(Helatodo carga) {
        carga.cargarEnAuto(this.cargas);
    }

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.remove(this.cargas.size()-1);
    }

    private void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar un auto sin cargamento");
        }
    }
}
