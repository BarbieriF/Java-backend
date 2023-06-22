/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio6;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio c1 = new CafeteraServicio();
        Cafetera ca = c1.crearCafetera();
        c1.llenarCafetera(ca);
        c1.servirTaza(ca);
        c1.servirTaza(ca);
        c1.agregarCafe(ca);
        c1.vaciaCafetera(ca);
    }
    
}
