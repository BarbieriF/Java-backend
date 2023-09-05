/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesejercicioe3;

import Entidad.Libreria;
import Servicio.LibreriaServicio;

/**
 *
 * @author franc
 */
public class ColeccionesEjercicioe3 {

    public static void main(String[] args) {
        LibreriaServicio ls = new LibreriaServicio();
        Libreria l1 = new Libreria("viaje al centro de la tierra", "julio verne", 10, 0);
        Libreria l2 = new Libreria("de la tierra a la luna", "julio verne", 10, 0);
        Libreria l3 = new Libreria("la isla misteriosa", "julio verne", 10, 0);
        Libreria l4 = new Libreria("20 mil leguas de viaje submarino", "julio verne", 10, 0);
        ls.agregarLibros(l1);
        ls.agregarLibros(l2);
        ls.agregarLibros(l3);
        ls.agregarLibros(l4);
        
        ls.prestamo("viaje al centro de la tierra");
        ls.prestamo("la isla misteriosa");
        ls.mostrarCatalogo();
        ls.prestamo("sad");
        ls.debolucion("viaje al centro de la tierra");        
        ls.mostrarCatalogo();
    }
}
