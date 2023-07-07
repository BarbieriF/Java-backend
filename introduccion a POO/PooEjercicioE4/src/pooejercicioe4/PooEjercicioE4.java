/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicioe4;

import Entidad.NIF;
import Servicio.ServicioNIF;

/**
 *
 * @author franc
 */
public class PooEjercicioE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF n = new ServicioNIF();
        NIF n1 = n.crearNif();
        n.mostrar(n1);
    }
    
}
