public class FabricaDeEfectos {

    public static ColeccionDeEfectos CrearEfectoAgregarCincoAlFinal() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(5));
        return efectos;
    }

    public static ColeccionDeEfectos CrearEfectoAgregarOchoAlFinal() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(8));
        return efectos;
    }

    public static ColeccionDeEfectos CrearEfectoPrimeraMayuscula() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoPrimerLetraMayuscula());
        return efectos;
    }

    public static ColeccionDeEfectos CrearEfectoPrimeraMayusculaYAgregarOcho() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoPrimerLetraMayuscula());
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(8));
        return efectos;
    }

    public static ColeccionDeEfectos CrearEfectoDarVueltaYPrimeraMayuscula() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoDarVuelta());
        efectos.agregarEfecto(new EfectoPrimerLetraMayuscula());
        return efectos;
    }

}
