package modelo;

public class Empanadero {

    private TipoCocineroRegular tipoEmpanadero;

    public Empanadero(TipoCocineroRegular regular) {
        this.tipoEmpanadero = regular;
    }

    public EmpanadaRegular hacerEmpanada() {
        return this.tipoEmpanadero.hacerEmpanada();
    }
}
