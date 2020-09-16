package modelo;

public class Empanadero {

    private Regular tipoEmpanadero;

    public Empanadero(Regular regular) {
        this.tipoEmpanadero = regular;
    }

    public EmpanadaRegular hacerEmpanada() {
        return this.tipoEmpanadero.hacerEmpanada();
    }
}
