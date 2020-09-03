public class EfectoAgregarNumeroAlFinal extends Efecto{

    private int numero;

    public EfectoAgregarNumeroAlFinal(int numero) {
        this.numero = numero;
    }

    @Override
    public String aplicarA(String unString){
        verificarStringNoVacio(unString);
        return (unString + this.numero);
    }

}
