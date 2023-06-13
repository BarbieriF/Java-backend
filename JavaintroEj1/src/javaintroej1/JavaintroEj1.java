/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaintroej1;
import java.util.Scanner;
/**
 *
 * @author franc
 */
public class JavaintroEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        String nombre = leer.nextLine();         
                
        System.out.print("mi nombre es "+nombre);  
        System.out.print(" y mi edad es "+num1);
    }
    
}
