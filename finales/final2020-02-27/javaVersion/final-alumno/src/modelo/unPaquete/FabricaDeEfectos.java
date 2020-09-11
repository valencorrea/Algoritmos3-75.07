package unPaquete;

import unPaquete.efectos.EfectoAgregarNumeroAlFinal;
import unPaquete.efectos.EfectoDarVuelta;
import unPaquete.efectos.EfectoPrimerLetraMayuscula;
import unPaquete.efectos.EfectoPrimerLetraMinuscula;

public class FabricaDeEfectos {

    public static ColeccionDeEfectos CrearEfectoAgregarNumeroAlFinal(int unNumero) {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(unNumero));
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

    public static ColeccionDeEfectos CrearEfectoAgregar3AlFinalYPrimerLetraMinuscula() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(3));
        efectos.agregarEfecto(new EfectoPrimerLetraMinuscula());
        return efectos;
    }

    public static ColeccionDeEfectos CrearEfectoDarVueltaPrimeraLetraEnMinusculaYAgregar4AlFinal() {
        ColeccionDeEfectos efectos = new ColeccionDeEfectos();
        efectos.agregarEfecto(new EfectoDarVuelta());
        efectos.agregarEfecto(new EfectoPrimerLetraMinuscula());
        efectos.agregarEfecto(new EfectoAgregarNumeroAlFinal(4));
        return efectos;
    }
}
