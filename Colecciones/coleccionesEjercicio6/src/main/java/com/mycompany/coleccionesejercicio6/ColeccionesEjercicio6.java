/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesejercicio6;

import Entidad.Tienda;
import Servicio.TiendaServicio;

/**
 *
 * @author franc
 */
public class ColeccionesEjercicio6 {

    public static void main(String[] args) {
        TiendaServicio ts = new TiendaServicio();
        Tienda p1 = new Tienda("detergente",25.5);
        Tienda p2 = new Tienda("pepas",18.3);
        Tienda p3 = new Tienda("queso la paulina",900.55);
        ts.ingresarProducto(p1);
        ts.ingresarProducto(p2);
        ts.ingresarProducto(p3);
        ts.mostrarProductos();
        ts.modificarPrecio("pepas");
        ts.eliminarProducto("detergente");
        ts.mostrarProductos();
                
    }
}
