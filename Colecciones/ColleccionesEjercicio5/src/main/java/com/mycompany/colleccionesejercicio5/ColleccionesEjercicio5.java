/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colleccionesejercicio5;

import Servicio.PaisServicio;

/**
 *
 * @author franc
 */
public class ColleccionesEjercicio5 {

    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        ps.listarPaises();
        ps.mostrarLista();
        ps.eliminarPais("francia");
        ps.mostrarLista();
    }
}
