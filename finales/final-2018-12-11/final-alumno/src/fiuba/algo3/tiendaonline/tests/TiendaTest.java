package fiuba.algo3.tiendaonline.tests;

import fiuba.algo3.tiendaonline.modelo.*;
import fiuba.algo3.tiendaonline.modelo.cupones.CuponBlackFriday;
import fiuba.algo3.tiendaonline.modelo.cupones.CuponCyberMonday;
import fiuba.algo3.tiendaonline.modelo.cupones.CuponNavidad;
import fiuba.algo3.tiendaonline.modelo.envios.EnvioInternacional;
import fiuba.algo3.tiendaonline.modelo.envios.EnvioLocal;
import org.junit.Assert;
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

        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 4)); //precio y stock

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioLocal(), new CuponNavidad(), "Raspberry", 1);
        pedido.agregarProducto(producto);

        assertEquals(2887.5, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnRaspberryPi3CuponNavidadPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 4)); //precio y stock

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponNavidad(), "Raspberry", 1);
        pedido.agregarProducto(producto);

        assertEquals(3150, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnRaspberryPi3CuponBlackFridayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 4)); //precio y stock

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponBlackFriday(), "Raspberry", 1);
        pedido.agregarProducto(producto);

        assertEquals(630, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testDosRaspberryPi3CuponBlackFridayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 4)); //precio y stock

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponBlackFriday(), "Raspberry", 2);
        pedido.agregarProducto(producto);

        assertEquals(1260, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnArduinoKitPi3CuponBlackFridayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");


        tienda.agregarStock("Arduino kit", new ProductoStockeado(2000, 4));

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponBlackFriday(), "Arduino kit", 1);
        pedido.agregarProducto(producto);

        assertEquals(360, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnArduinoKitPi3CuponCyberMondayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Arduino kit", new ProductoStockeado(2000, 4));

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Arduino kit", 1);
        pedido.agregarProducto(producto);

        assertEquals(1200, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnArduinoSuperKitPi3CuponCyberMondayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Arduino super kit", new ProductoStockeado(4000, 4));

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Arduino super kit", 1);
        pedido.agregarProducto(producto);

        assertEquals(2400, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testUnArduinoSuperKitYunRaspberryAmbosCon3CuponCyberMondayPorEnvioInternacionalCuestaLoQueDeberia(){

        Tienda tienda = new Tienda("un nombre de tienda");

        tienda.agregarStock("Arduino super kit", new ProductoStockeado(4000, 4));
        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 4));

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Raspberry", 1);
        pedido.agregarProducto(producto);
        ProductoCliente otroProducto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Arduino super kit", 1);
        pedido.agregarProducto(otroProducto);

        assertEquals(4500, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void testSiNoTengoUnProductoEnStockNoPuedoComprarlo(){

        Tienda tienda = new Tienda("un nombre de tienda");

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Raspberry", 1);

        pedido.agregarProducto(producto);

        try {
            tienda.cobrarPedido(pedido);
            Assert.fail("No se arrojo exception al querer comprar un producto que no tengo stockeado");
        } catch (RuntimeException exception) {
            assertEquals("No se puede comprar un producto que no se tiene en stock", exception.getMessage());
        }
    }

    @Test
    public void testSiYaNoMeQuedoStockNoPuedoComprarlo(){

        Tienda tienda = new Tienda("un nombre de tienda");
        tienda.agregarStock("Raspberry", new ProductoStockeado(3500, 0));

        Pedido pedido = new Pedido();
        ProductoCliente producto = new ProductoCliente(new EnvioInternacional(), new CuponCyberMonday(), "Raspberry", 1);

        pedido.agregarProducto(producto);

        try {
            tienda.cobrarPedido(pedido);
            Assert.fail("No se arrojo exception al querer comprar un producto del que ya no me quedaron unidades");
        } catch (RuntimeException exception) {
            assertEquals("No se puede comprar un producto del cual ya no tengo unidades", exception.getMessage());
        }
    }

}