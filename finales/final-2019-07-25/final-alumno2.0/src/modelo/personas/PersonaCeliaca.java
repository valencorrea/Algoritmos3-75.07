package modelo.personas;

import modelo.comida.Comida;

public class PersonaCeliaca {

    private int calorias; //tremendoooo se inicializa solo en 0!!!!!!

    public int calcularCalorias() {
        return this.calorias;
    }

    public void comer(Comida comida) {
        this.calorias = comida.comer();
    }
}
