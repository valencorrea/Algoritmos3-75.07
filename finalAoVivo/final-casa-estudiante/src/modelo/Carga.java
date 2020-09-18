package modelo;

import java.util.LinkedList;

public interface Carga {

    void cargarEnAuto(LinkedList<Carga> cargas, EstadoPortabici estado);

    void cargarEnMoto(LinkedList<Carga> cargas);
}

