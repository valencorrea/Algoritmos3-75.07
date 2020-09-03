public abstract class Efecto {

    public String aplicarA(String unString) {
        return unString;//Esta bien que devuelva el mismo por default?
    }

    public void verificarStringNoVacio(String unString){
        if(unString.contentEquals("")){
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }
    }

}
