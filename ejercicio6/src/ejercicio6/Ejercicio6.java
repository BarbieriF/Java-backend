/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        
        if (0==num%2){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
    }
    
}
