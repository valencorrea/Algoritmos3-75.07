package modelo;

import java.util.LinkedList;

public class Helatodo implements Carga{

    public void cargarEnMoto(LinkedList<Carga> cargas) {
        cargas.add(this);
    }

    public void cargarEnAuto(LinkedList<Carga> cargas) {
        cargas.add(this);
    }
}
