package modelo;

import modelo.superficies.Superficie;

public interface Corredor {

    int correr(Superficie superficie);

    int correrEnPistaDeAtletismo();

    int correrEnBarro();

    int correrEnHielo();

}
