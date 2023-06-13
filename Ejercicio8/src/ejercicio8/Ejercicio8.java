/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una palabra de 8 letras");
        
        String palabra = leer.nextLine();
        
        if (palabra.length()==8){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
    }
    
}
