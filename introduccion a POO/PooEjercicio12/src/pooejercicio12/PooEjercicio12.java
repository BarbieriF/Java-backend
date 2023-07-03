/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio12;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio(); 
        Persona p1 = ps.crearPersona();
        System.out.println(ps.calcularEdad(p1));
        System.out.println("es menor de 30? "+ps.menorQue(p1, 30));
        ps.mostrarPersona(p1);
    }
    
}
