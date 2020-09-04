package modelo.efectos;

public class EfectoDarVuelta extends Efecto {

    @Override
    public String aplicarA(String unString) {
        String nuevoString = "";//Ojo que si pongo un espacio no funciona

        for(char unaLetra: unString.toCharArray()){
            nuevoString = unaLetra + nuevoString;
        }
        
        return nuevoString;
    }

}
