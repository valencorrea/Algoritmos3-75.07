package modelo;

public class Panadero {

    private TipoCocinero tipoPanadero;

    public Panadero(TipoCocinero tipo) {
        this.tipoPanadero = tipo;
    }

    public Pan hacerPan() {
        return this.tipoPanadero.hacerPan();
    }
}
