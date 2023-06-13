/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una palabra que comience con a");
        String palabra= leer.nextLine();
        
        if (palabra.substring(0,1).equals("a")){
            System.out.println("correcto");
            
        }else{
            System.out.println("incorrecto");
        }
    }
    
}

        