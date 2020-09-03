public class FabricaDeEfectos {

    public static ColeccionDeEfectos CrearEfectoAgregarCincoAlFinal() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(5));
        return efectos;
    }
/*
    public static EfectoAgregarNumeroAlFinal CrearEfectoAgregarOchoAlFinal() {
        return new EfectoAgregarNumeroAlFinal(8);
    }



    /*
    public static EfectoDarVueltaYPrimeraMayuscula CrearEfectoDarVueltaYPrimeraMayuscula() {
        return new EfectoDarVueltaYPrimeraMayuscula();
    }

    public static EfectoPrimeraMayuscula CrearEfectoPrimeraMayuscula() {
        return new EfectoPrimeraMayuscula();
    }

    public static EfectoPrimeraMayusculaYAgregarOcho CrearEfectoPrimeraMayusculaYAgregarOcho() {
        return new EfectoPrimeraMayusculaYAgregarOcho();
    }*/

}
