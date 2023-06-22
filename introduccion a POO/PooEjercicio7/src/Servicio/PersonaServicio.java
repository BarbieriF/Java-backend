/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
        
        System.out.println("ingrese un nombre");
        p1.setNombre(leer.nextLine());
        
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        
        System.out.println("ingrese el sexo H (hombre), M (mujer) u O (otro). ");
        p1.setSexo(leer.next().charAt(0));
        
        
        System.out.println("ingrese el peso");
        p1.setPeso(leer.nextInt());
        leer.nextLine();
        
        System.out.println("ingrese la altura");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    }
    
    public int calcularIMC(Persona p1){
        if (p1.getPeso()/Math.pow(p1.getAltura(), 2) < 20 ){
            return -1;
        }else if(p1.getPeso()/Math.pow(p1.getAltura(), 2)>=20 && p1.getPeso()/Math.pow(p1.getAltura(), 2)<= 25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1){
        return p1.getEdad() >=18;
    }
    
}
