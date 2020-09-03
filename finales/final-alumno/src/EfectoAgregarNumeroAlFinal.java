public class EfectoAgregarNumeroAlFinal {

    private int numero;

    public EfectoAgregarNumeroAlFinal(int numero) {
        this.numero = numero;
    }

    public String aplicarA(String unString){
        return (unString + this.numero);
    }

}
