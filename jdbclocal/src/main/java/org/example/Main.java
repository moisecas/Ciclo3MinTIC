package org.example;

import controlador.Controlador;

public class Main {

    public static void main(String[] args) {
        Controlador control= new Controlador();
        control.recuperarArchivoVentas();
        control.trabajar();
    }
}