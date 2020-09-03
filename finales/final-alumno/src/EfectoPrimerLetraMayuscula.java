public class EfectoPrimerLetraMayuscula implements Efecto {

    @Override
    public String aplicarA(String unString) {
        //unaCadena.substring(0,1) solo de la posicion 0 a la 1 del string
        //unaCadena.substring(1) solo a partir de la posicion 1 del string
        unString = unString.substring(0,1).toUpperCase() + unString.substring(1);
        return unString;
    }
}
