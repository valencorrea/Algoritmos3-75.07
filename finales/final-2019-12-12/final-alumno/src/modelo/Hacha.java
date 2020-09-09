package modelo;

public class Hacha extends Herramienta {

    @Override
    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        chanchitos.usarHachaEnCasita();
    }
}
