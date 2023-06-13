/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra1;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tiempo en minutos");
        int tiempo = leer.nextInt();
                                     
             
        int dias = tiempo/60/24;
        int horas=(tiempo/60)%24;
        System.out.println("el tiempo ingresado equivale a dias "+dias+" horas "+horas);
        
    }
    
}
