package modelo.casas;

public abstract class Casa {

    protected boolean casaDestruida;

    public boolean casaDestruida(){
        return this.casaDestruida;
    };

    public abstract void soplarCasita();

    public abstract void usarHachaEnCasita();

    public abstract void taladrarCasita();
}
