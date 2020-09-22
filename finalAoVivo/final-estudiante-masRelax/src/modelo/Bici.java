package modelo;

import java.util.LinkedList;

public class Bici implements Carga{

    @Override
    public void cargarmeEnMoto(LinkedList<Carga> cargas) {
        throw new RuntimeException("No se puede cargar una bici en una moto");
    }

}
