/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class PersonaServicio {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona P = new Persona();
        
        System.out.println("ingrese el nombre");
        P.setNombre(leer.next());
        System.out.println("ingrese fecha nacimiento: dia");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el año");
        int anio = leer.nextInt();     
        
        P.setFechaNacimiento(LocalDate.of(anio, mes, dia));
        return P;        
    }
    
    public int calcularEdad(Persona P){        
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - P.getFechaNacimiento().getYear();
        return edad;
    }
    
    public boolean menorQue(Persona P, int edad){
        return calcularEdad(P) < edad;
    }
    
    public void mostrarPersona(Persona P){
        System.out.println("nombre: "+P.getNombre()+"; fecha de nacimiento "+P.getFechaNacimiento());
    }
    
    
}
