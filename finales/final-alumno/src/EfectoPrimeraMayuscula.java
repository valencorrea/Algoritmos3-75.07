public class EfectoPrimeraMayuscula {

    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);

        //unaCadena.substring(0,1) solo de la posicion 0 a la 1 del string
        //unaCadena.substring(1) solo a partir de la posicion 1 del string
        return nuevoString;
    }

}
