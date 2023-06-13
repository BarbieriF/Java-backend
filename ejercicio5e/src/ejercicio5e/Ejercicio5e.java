/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5e;

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class Ejercicio5e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("su doble es "+num*2+" su triple es "+num*3+" su raiz cuadrada es "+Math.sqrt(num));
    }
    
}
