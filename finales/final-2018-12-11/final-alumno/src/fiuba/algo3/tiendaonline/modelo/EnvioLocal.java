package fiuba.algo3.tiendaonline.modelo;

public class EnvioLocal implements Envio{

    public double agregarCostoEnvio(double precioBase) {
        return precioBase * 1.1;
    }

}
