package modelo;

public abstract class Casa {

    protected boolean casaDestruida;

    public boolean casaDestruida(){
        return false;
    };

    public void soplarCasita(){
        this.casaDestruida = false;
    };

}
