package modelo.estadoPortabici;

import modelo.cargas.Bici;
import modelo.cargas.Carga;

import java.util.LinkedList;

public interface EstadoPortabici {

    void cargar(LinkedList<Carga> cargas, Bici bici);

}
