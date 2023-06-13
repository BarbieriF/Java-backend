/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        
        
        if (palabra.equals("eureka")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
