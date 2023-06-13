/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {           
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        leer.nextLine(); // Consumir la nueva línea pendiente
        
        String nombre = leer.nextLine();         
        
        System.out.print("mi nombre es " + nombre);  
        System.out.print(" y mi edad es " + num1);
    }
    
}
