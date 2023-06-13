/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadrado");
        int n = leer.nextInt();
       
        
        for (int i=0; i < n ;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0; i<n-2; i++){
            System.out.print("*");
            for (int j=0; j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");            
        }
        for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
    }
    
}
