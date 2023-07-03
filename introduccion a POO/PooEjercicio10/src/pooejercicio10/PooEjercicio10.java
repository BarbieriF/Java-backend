/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio10;

import Entidad.Arreglos;
import Servicio.ArreglosServicio;


/**
 *
 * @author franc
 */
public class PooEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArreglosServicio AS = new ArreglosServicio();
        Arreglos A = AS.llenarA();
        AS.ordenarA(A);
        AS.llenarB(A);        
        
    }
    
}
