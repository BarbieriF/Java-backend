/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4e;

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class Ejercicio4e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la temperatura en grados Celcius");
        float tempC = leer.nextFloat();
        
        float tempF = 32+(9*tempC/5);
        
        System.out.println("la temperatura en grados Farenheit es "+tempF);
        
                
    }
    
}
