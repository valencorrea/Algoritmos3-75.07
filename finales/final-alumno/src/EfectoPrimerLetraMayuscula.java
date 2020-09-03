public class EfectoPrimerLetraMayuscula implements Efecto {

    @Override
    public String aplicarA(String unString) {
        unString = unString.substring(0,1).toUpperCase() + unString.substring(1);
        return unString;
    }
}
