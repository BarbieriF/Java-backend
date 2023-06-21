/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author ASUS
 */
public class PooEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
       Persona p1 = ps.crearPersona();
       Persona p2 = ps.crearPersona();
       Persona p3 = ps.crearPersona();
       Persona p4 = ps.crearPersona();
       
       int p1IMC = ps.calcularIMC(p1);
       int p2IMC = ps.calcularIMC(p2);
       int p3IMC = ps.calcularIMC(p3);
       int p4IMC = ps.calcularIMC(p4);
       
       boolean p1E = ps.esMayorDeEdad(p1);
       boolean p2E = ps.esMayorDeEdad(p2);
       boolean p3E = ps.esMayorDeEdad(p3);
       boolean p4E = ps.esMayorDeEdad(p4);
       
       
        
    }
    
}
