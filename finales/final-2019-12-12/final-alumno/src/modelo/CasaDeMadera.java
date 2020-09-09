package modelo;

public class CasaDeMadera extends Casa {

    @Override
    public void usarHachaEnCasita() {
        this.casaDestruida = true;
    }
}
