package fiuba.algo3.tiendaonline.tests;

import fiuba.algo3.tiendaonline.modelo.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TiendaTest {

    // el cupon te hace un descuento de tod el pedido, podes tenerlo or not

    //envio local recargo de 1.1 (agrega 10%)
    //envio inter recargo 1.2 (el 20%)
    //cupon navi * 0.75 (descuenta el 25)
    //cupon black friday * 0.15
    //cupon ciber monday * 0.5

    private static final double DELTA = 1e-12;

    @Test
    public void testUnRaspberryPi3CuponNavidadPorEnvioLocalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new Producto(3500, 4)); //precio y stock

        Pedido pedido = new Pedido(new EnvioLocal(), new CuponNavidad(), "Raspberry", 1);//cantidad que quiero pedir

        assertEquals(2887.5, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnRaspberryPi3CuponNavidadPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new Producto(3500, 4)); //precio y stock

        Pedido pedido = new Pedido(new EnvioInternacional(), new CuponNavidad(), "Raspberry", 1);//cantidad que quiero pedir

        assertEquals(3150, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnRaspberryPi3CuponBlackFridayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new Producto(3500, 4)); //precio y stock

        Pedido pedido = new Pedido(new EnvioInternacional(), new CuponBlackFriday(), "Raspberry", 1);//cantidad que quiero pedir

        assertEquals(630, tienda.cobrarPedido(pedido), DELTA);
    }

}


/*
*  @Test
    public void prueba02() {
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);

        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        TiendaOnline tienda = new TiendaOnline();
        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);

        tienda.crearNuevoPedido();

        tienda.agregarProductoAlPedido("Arduino kit", 3);
        tienda.agregarProductoAlPedido("Arduino super kit", 1);

        tienda.agregarEnvio(new EnvioInternacional()); // se le aplica un recargo del 20%

        tienda.agregarCuponDeDescuento(Cupon.CYBER_MONDAY_50); // se le aplica un descuento del 50%

        assertEquals(6000, tienda.cobrarPedido(), DELTA);
*
* */