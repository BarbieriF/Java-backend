/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio14;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        Movil m1 = ms.cargarCelular();
        System.out.println(m1.toString());
    }
    
}
