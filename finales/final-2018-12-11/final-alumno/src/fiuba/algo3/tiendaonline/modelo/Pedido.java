package fiuba.algo3.tiendaonline.modelo;

import fiuba.algo3.tiendaonline.modelo.cupones.Cupon;

public class Pedido {

    private int cantidadUnidades;
    private String nombreProducto;
    private Envio envio;
    private Cupon cupon;

    public Pedido(Envio envio, Cupon cupon, String nombreProducto, int cantidadUnidades) {
        this.envio = envio;
        this.cupon = cupon;
        this.nombreProducto = nombreProducto;
        this.cantidadUnidades = cantidadUnidades;
    }

    public String codigo() {
        return this.nombreProducto;
    }

    public int cantidadDeUnidades() {
        return this.cantidadUnidades;
    }

    public double cobrarPedido(Producto productoEnTienda) {//refactorizar esta mugre
        double precioBase = productoEnTienda.precio();
        precioBase = this.cupon.bonificar(precioBase);
        precioBase = this.envio.agregarCostoEnvio(precioBase);
        precioBase = precioBase * this.cantidadUnidades;
        return precioBase;
    }
}
