package modelo;

public class PersonaSinEnfermedades {

    private int calorias = 0;

    public int calcularCalorias() {
        return this.calorias;
    }

    public void comer(Pan comida) {
        this.calorias = comida.comer();
    }
}
