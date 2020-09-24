package fiuba.algo3.tiendaonline.modelo;

import java.util.HashMap;
import java.util.Map;

public class Tienda {

    private String nombre;
    private Map<String, Producto> productos = new HashMap<String, Producto>();

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void agregarStock(String nombreProducto, Producto producto) {
        this.productos.put(nombreProducto, producto);
    }

    public double cobrarPedido(Pedido pedido) {
        Producto productoEnTienda = buscarProducto(pedido);
        productoEnTienda.descontarCantidadComprada(pedido);
        return pedido.cobrarPedido(productoEnTienda);
    }

    private Producto buscarProducto(Pedido pedido) {
        if(!this.productos.containsKey(pedido)){
            //error
        }
        return this.productos.get(pedido.codigo());
    }
}
