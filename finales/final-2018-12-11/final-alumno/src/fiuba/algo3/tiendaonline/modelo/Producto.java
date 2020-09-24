package fiuba.algo3.tiendaonline.modelo;

public class Producto {

    private int precio;
    private int stock;

    public Producto(int precio, int stock) {
        this.precio = precio;
        this.stock = stock;
    }

    public void descontarCantidadComprada(Pedido pedido) {
        //tirar error si me piden mas de lo que tengo
        this.stock -= pedido.cantidadDeUnidades();
    }

    public int precio() {
        return this.precio;
    }
}
