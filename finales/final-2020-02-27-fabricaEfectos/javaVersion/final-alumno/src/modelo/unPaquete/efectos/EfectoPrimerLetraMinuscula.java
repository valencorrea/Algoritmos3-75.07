package unPaquete.efectos;

public class EfectoPrimerLetraMinuscula extends Efecto {

    @Override
    public String aplicarA(String unString) {
        unString = unString.substring(0, 1).toLowerCase() + unString.substring(1);
        return unString;
    }
}
