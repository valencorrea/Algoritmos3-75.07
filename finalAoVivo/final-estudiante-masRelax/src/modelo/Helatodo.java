package modelo;

import java.util.LinkedList;

public class Helatodo implements Carga{

    public void cargarmeEnMoto(LinkedList<Carga> cargas) {
        cargas.add(this);
    }

}
