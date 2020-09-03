public class EfectoAgregarNumeroAlFinal implements Efecto{

    private int numero;

    public EfectoAgregarNumeroAlFinal(int numero) {
        this.numero = numero;
    }

    @Override
    public String aplicarA(String unString){
        return (unString + this.numero);
    }

}
