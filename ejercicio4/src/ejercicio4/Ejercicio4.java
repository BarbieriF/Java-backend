/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author franc
 */
import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);
System.out.println("Ingresa tu edad");
int edad = leer.nextInt();
leer.nextLine();
System.out.println("Ingresa tu nombre");
String nombre = leer.nextLine();
System.out.println("Tu nombre es "+nombre+" y tu edad es "+edad);

}
    
}
