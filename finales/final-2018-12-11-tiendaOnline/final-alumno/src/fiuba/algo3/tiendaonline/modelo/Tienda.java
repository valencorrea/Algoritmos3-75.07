package fiuba.algo3.tiendaonline.modelo;

import java.util.HashMap;
import java.util.Map;

public class Tienda {

    private String nombre;
    private Map<String, ProductoStockeado> productos = new HashMap<String, ProductoStockeado>();

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void agregarStock(String nombreProducto, ProductoStockeado producto) {
        this.productos.put(nombreProducto, producto);
    }

    public double cobrarPedido(Pedido pedido) {
        return pedido.cobrarPedido(this.productos);
    }

}
