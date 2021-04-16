package main;

import java.util.ArrayList;
import java.util.List;

public class Palabra {

    public List<main.Celda> celdas;

    public Palabra() {

    	this.celdas = new ArrayList<main.Celda>();
    }


    public int puntaje() {

        int result = 0;

        for (main.Celda c : this.celdas) {
        	
    		result += c.getPesoLetra();

        }

        return result;
    }
}
 
