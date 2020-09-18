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
}
