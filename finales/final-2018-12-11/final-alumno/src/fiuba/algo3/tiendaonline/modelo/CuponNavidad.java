package fiuba.algo3.tiendaonline.modelo;

public class CuponNavidad implements Cupon{

    public double bonificar(double precioBase) {
        return precioBase * 0.75;
    }

}
