package modelo.estadoPortabici;

import modelo.cargas.Bici;
import modelo.cargas.Carga;

import java.util.LinkedList;

public class NoTienePortabici implements EstadoPortabici {

    @Override
    public void cargar(LinkedList<Carga> cargas, Bici bici) {
        throw new RuntimeException("No se puede cargar una bici sin portabici");
    }

}
