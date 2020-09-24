package fiuba.algo3.tiendaonline.modelo;

import fiuba.algo3.tiendaonline.modelo.cupones.Cupon;

public class CuponCyberMonday implements Cupon {

    @Override
    public double bonificar(double precioBase) {
        return precioBase * 0.5;
    }

}
