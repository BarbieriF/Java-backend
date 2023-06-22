/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("ingrese edad ");  
        int num1 = leer.nextInt();
        leer.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("ingrese su nombre");  
        String nombre = leer.nextLine();         
        
        System.out.print("mi nombre es " + nombre);  
        System.out.print(" y mi edad es " + num1);
    }
}
