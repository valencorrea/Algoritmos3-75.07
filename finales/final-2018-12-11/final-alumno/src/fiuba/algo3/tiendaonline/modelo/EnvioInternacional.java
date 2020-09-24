package fiuba.algo3.tiendaonline.modelo;

public class EnvioInternacional implements Envio{

    public double agregarCostoEnvio(double precioBase) {
        return precioBase * 1.2;
    }

}
