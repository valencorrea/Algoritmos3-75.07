package modelo;

public abstract class Casa {

    protected boolean casaDestruida;

    public boolean casaDestruida(){
        return this.casaDestruida;
    };

    public void soplarCasita(){
        this.casaDestruida = false;
    };

    public void usarHachaEnCasita(){
        this.casaDestruida = false;
    };

}
