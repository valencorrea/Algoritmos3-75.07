package modelo;

public class TipoCocineroCeliaco implements TipoCocinero {

    @Override
    public PanCeliaco hacerPan() {
        return (new PanCeliaco());
    }

}
