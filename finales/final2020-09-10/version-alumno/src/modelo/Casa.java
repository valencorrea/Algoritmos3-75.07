package modelo;

import java.util.LinkedList;

public class Casa {

    private LinkedList<Estufa> estufas = new LinkedList<Estufa>();

    public void comprarEstufa(int ambientes, int precioKw, int calorias) {
        this.guardarEstufa(new Estufa(ambientes, precioKw, calorias));
    }

    private void guardarEstufa(Estufa estufa) {
        this.estufas.add(estufa);
    }

    public int gastoTotal() {
        int precio = 0;

        for(Estufa estufa: this.estufas){
            precio += estufa.gasto();
        }

        return precio;
    }
}
