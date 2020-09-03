public class EfectoDarVuelta implements Efecto {

    @Override
    public String aplicarA(String unString) {
        String nuevoString = "";//Ojo que si pongo un espacio no funciona

        for(char unaLetra: unString.toCharArray()){
            nuevoString = unaLetra + nuevoString;
        }
        
        return nuevoString;
    }
}
