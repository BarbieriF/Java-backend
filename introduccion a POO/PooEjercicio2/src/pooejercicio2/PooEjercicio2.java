/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio2;

import Entidad.Circunferencia;
import Servicios.CircunferenciaServicios;

/**
 *
 * @author franc
 */
public class PooEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicios cs = new CircunferenciaServicios();
        Circunferencia c1 = cs.crearCircunferencia();
        cs.area(c1);
        cs.perimetro(c1);
        cs.mostrarInfo(cs.area(c1),cs.perimetro(c1));
        
    }
    
      
    
    
}
