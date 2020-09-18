package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Helatodo {

    public void cargarEnMoto(ArrayList<Helatodo> cargas) {
        cargas.add(this);
    }

    public void cargarEnAuto(LinkedList<Helatodo> cargas) {
        cargas.add(this);
    }
}
