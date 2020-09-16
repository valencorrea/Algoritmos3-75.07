package modelo;

public class Panadero {

    private TipoCocinero tipoPanadero;

    public Panadero(TipoCocinero tipo) {
        this.tipoPanadero = tipo;
    }

    public Comida hacerPan() {
        return this.tipoPanadero.hacerPan();
    }
}
