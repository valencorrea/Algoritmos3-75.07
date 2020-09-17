package modelo;

public abstract class Transporte {

    int pagarPeaje(){
        return this.tipoPagador.pagar(this.cantidadRuedas, this.precioPorRueda, this.coeficienteTelepase);
    }

}
