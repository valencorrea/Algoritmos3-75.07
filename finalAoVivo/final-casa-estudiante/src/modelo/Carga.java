package modelo;

import java.util.LinkedList;

public interface Carga {

    void cargarEnMoto(LinkedList<Carga> cargas);

    void cargarEnAuto(LinkedList<Carga> cargas);

}

