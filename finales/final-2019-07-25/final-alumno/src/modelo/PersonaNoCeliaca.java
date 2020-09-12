package modelo;

public class PersonaNoCeliaca {

    private int calorias = 0;

    public int getCalorias() {
        return this.calorias;
    }

    public void comer(Comida pan) {
        this.aumentarCalorias(pan.getCalorias());
    }

    private void aumentarCalorias(int calorias) {
        this.calorias += calorias;
    }
}
