package modelo;

public class Panadero {

    private Regular tipoPanadero;

    public Panadero(Regular tipoPanadero) {
        this.tipoPanadero = tipoPanadero;
    }

    public PanRegular hacerPan() {
        return this.tipoPanadero.hacerPan();
    }
}
