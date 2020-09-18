package modelo;

import java.util.ArrayList;

public class Moto {

    private ArrayList<Helatodo> cargas = new ArrayList<>();

    public void cargar(Helatodo carga) {
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
