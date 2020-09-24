package fiuba.algo3.tiendaonline.modelo;

import fiuba.algo3.tiendaonline.modelo.cupones.Cupon;
import fiuba.algo3.tiendaonline.modelo.cupones.CuponNavidad;
import fiuba.algo3.tiendaonline.modelo.envios.Envio;
import fiuba.algo3.tiendaonline.modelo.envios.EnvioLocal;

public class ProductoCliente {

    private Envio envio;
    private Cupon cupon;
    private String nombre;
    private int unidades;

    public ProductoCliente(Envio envio, Cupon cupon, String nombre, int cantUnidades) {
        this.envio = envio;
        this.cupon = cupon;
        this.nombre = nombre;
        this.unidades = cantUnidades;
    }

    public String nombre() {
        return this.nombre;
    }

    public double precio(ProductoStockeado productoStockeado) {
        return (productoStockeado.precio() * this.envio.costo() * this.cupon.descuento() * unidades);
    }

    public int cantidadUnidades() {
        return this.unidades;
    }
}
