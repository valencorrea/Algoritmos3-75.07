package modelo;

import java.util.LinkedList;

public interface Carga {

    void cargarEnAuto(LinkedList<Carga> cargas);

    void cargarEnMoto(LinkedList<Carga> cargas);
}

