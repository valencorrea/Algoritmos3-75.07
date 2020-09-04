package modelo;

import modelo.efectos.*;
import java.util.ArrayList;

public class ColeccionDeEfectos {

    private ArrayList<Efecto> efectos = new ArrayList<Efecto>();

    public void agregarEfecto(Efecto unEfecto) {
        this.efectos.add(unEfecto);
    }

    public String aplicarA(String unString) {
        verificarStringNoVacio(unString);

        for(Efecto unEfecto: this.efectos) {
            unString = unEfecto.aplicarA(unString);
        }

        return unString;
    }

    private void verificarStringNoVacio(String unString) {
        if(unString.contentEquals("")){
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }
    }
}
