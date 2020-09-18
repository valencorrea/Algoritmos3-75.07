package modelo;

import java.util.LinkedList;

public class Bici implements Carga{

    @Override
    public void cargarEnAuto(LinkedList<Carga> cargas, EstadoPortabici estado) {
        estado.cargar(cargas, this);
    }

    @Override
    public void cargarEnMoto(LinkedList<Carga> cargas) {
        throw new RuntimeException("No se puede cargar una bici en una moto");
    }

}
