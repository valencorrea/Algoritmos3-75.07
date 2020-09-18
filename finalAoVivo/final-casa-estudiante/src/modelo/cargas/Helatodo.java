package modelo.cargas;

import modelo.estadoPortabici.EstadoPortabici;

import java.util.LinkedList;

public class Helatodo implements Carga{

    @Override
    public void cargarEnAuto(LinkedList<Carga> cargas, EstadoPortabici estado) {
        cargas.add(this);
    }

    public void cargarEnMoto(LinkedList<Carga> cargas) {
        cargas.add(this);
    }

}
