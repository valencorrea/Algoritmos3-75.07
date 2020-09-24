package fiuba.algo3.tiendaonline.modelo;

public class ProductoStockeado {

    private int precio;
    private int stock;

    public ProductoStockeado(int precio, int stock) {
        this.precio = precio;
        this.stock = stock;
    }

    public int precio() {
        return this.precio;
    }

    public void reducirStock(ProductoCliente productoCliente) {
        verificarStock();
        this.stock -= productoCliente.cantidadUnidades();
    }

    private void verificarStock() {
        if(stock <= 0){
            throw new RuntimeException("No se puede comprar un producto del cual ya no tengo unidades");
        }
    }
}
