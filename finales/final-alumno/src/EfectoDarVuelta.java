public class EfectoDarVuelta extends Efecto {

    @Override
    public String aplicarA(String unString) {
        verificarStringNoVacio(unString);
        String nuevoString = "";//Ojo que si pongo un espacio no funciona

        for(char unaLetra: unString.toCharArray()){
            nuevoString = unaLetra + nuevoString;
        }
        
        return nuevoString;
    }
}
