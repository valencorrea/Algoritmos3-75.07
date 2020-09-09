package modelo;

public class Lobo {

    private Soplido ataque = new Soplido(); //Despues cambiar a clase Ataque

    public void atacarCasaDelChanchito(Chanchitos chanchitos) {
        this.ataque.atacarCasaDelChanchito(chanchitos);
    }

}
