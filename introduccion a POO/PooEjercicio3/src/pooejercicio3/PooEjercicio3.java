/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio op = new OperacionServicio();
        Operacion prueba = op.crearOperacion();                        
        System.out.println("suma = "+op.sumar(prueba)+" resta = "+op.restar(prueba)+" producto = "+op.multiplicar(prueba)+" cociente = "+op.dividir(prueba));
    }
    
}
