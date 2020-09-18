package modelo;

import java.util.LinkedList;

public class TienePortabici implements EstadoPortabici {

    @Override
    public void cargar(LinkedList<Carga> cargas, Bici bici) {
        cargas.add(bici);
    }
}
