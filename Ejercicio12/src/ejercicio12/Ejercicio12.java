/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int correcto= 0;
            int incorrecto=0;
                    
            String palabra= "";
            while (!palabra.equals("&&&&&")){
                palabra=leer.nextLine();
                if (palabra.length()==5){
                    if (palabra.substring(0, 1).equals("X") && palabra.substring(4).equals("O")){
                        correcto++;
                    }else{
                        incorrecto++;
                    }
                }else{
                    incorrecto++;
                }
                    
            }

            System.out.println("la cantidad de intenos incorrecto fueron "+(incorrecto-1)+" la cantidad de intentos correctos fueron "+correcto);
            
    }
    
}
