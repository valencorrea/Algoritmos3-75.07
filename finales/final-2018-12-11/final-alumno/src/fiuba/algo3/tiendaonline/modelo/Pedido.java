package fiuba.algo3.tiendaonline.modelo;

import fiuba.algo3.tiendaonline.modelo.cupones.Cupon;
import fiuba.algo3.tiendaonline.modelo.envios.Envio;
import java.util.LinkedList;
import java.util.Map;

public class Pedido {

    private LinkedList<ProductoCliente> productos = new LinkedList<ProductoCliente>();

    public void agregarProducto(ProductoCliente producto) {
        this.productos.add(producto);
    }

    public double cobrarPedido(Map <String, ProductoStockeado> productos) {
        double precio = 0;

        for(ProductoCliente productoCliente: this.productos){
            ProductoStockeado productoStockeado = buscarEnDeposito(productoCliente, productos);
            productoStockeado.reducirStock(productoCliente);
            precio += productoCliente.precio(productoStockeado);
        }
        
        return precio;
    }

    private ProductoStockeado buscarEnDeposito(ProductoCliente productoCliente, Map<String, ProductoStockeado> productos) {
        if(!productos.containsKey(productoCliente.nombre())){
            throw new RuntimeException("No se puede comprar un producto que no se tiene en stock");
        }
        return productos.get(productoCliente.nombre());
    }

}
