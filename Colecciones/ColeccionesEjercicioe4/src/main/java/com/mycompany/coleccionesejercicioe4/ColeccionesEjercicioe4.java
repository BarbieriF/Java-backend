/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesejercicioe4;

import Servicio.RegionServicio;

/**
 *
 * @author franc
 */
public class ColeccionesEjercicioe4 {

    public static void main(String[] args) {
        RegionServicio rs = new RegionServicio();
        rs.creacionLista();
        rs.mostrarLista();
        rs.buscarPorCodigo();
        rs.eliminarCiudades();
        rs.mostrarLista();
    }
}
