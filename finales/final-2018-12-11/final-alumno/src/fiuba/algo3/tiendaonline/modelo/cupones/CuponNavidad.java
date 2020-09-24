package fiuba.algo3.tiendaonline.modelo.cupones;

public class CuponNavidad implements Cupon{

    public double bonificar(double precioBase) {
        return precioBase * 0.75;
    }

}
