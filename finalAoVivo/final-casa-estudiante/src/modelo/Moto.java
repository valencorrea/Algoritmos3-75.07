package modelo;

import java.util.LinkedList;

public class Moto {

    private LinkedList<Carga> cargas = new LinkedList<Carga>();

    public void cargar(Carga carga) {
        carga.cargarEnMoto(this.cargas);
    }

    public int cantidadCargas() {
        return this.cargas.size();
    }

    public void descargar() {
        verificacionDeCargamento();
        this.cargas.remove(this.cargas.size()-1);
    }

    private void verificacionDeCargamento() {
        if(cantidadCargas() == 0){
            throw new RuntimeException("No se puede descargar una moto sin cargamento");
        }
    }
}
