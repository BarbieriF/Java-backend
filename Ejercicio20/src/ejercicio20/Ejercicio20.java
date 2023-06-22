/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][]matriz= {{2,7,6},{9,5,1},{4,3,8}};
        
        for (int [] fila : matriz){
            for (int j : fila){
                System.out.print("["+j+"]");
            }
            System.out.println("");
        }        
        
        System.out.println("la matriz ingresada es magica? "+esMagica(matriz));
        
    }
    
    public static void llenarMatriz(int [][] matriz){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de la matriz 3x3");
        for (int [] fila : matriz){
            for (int i = 0; i < fila.length; i++) {
                fila[i]= leer.nextInt();                
            }
        }
    }
    
    public static boolean esMagica(int [][] matriz){
        int magica = 0;
        boolean bandera = true;
        for (int [] fila : matriz){
            for (int i = 0; i < fila.length; i++) {
                magica = magica + fila[i];                
            }
            if (magica!=15){
                bandera = false;
            }
            magica=0;
        }
        
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                magica = magica + matriz[i] [j];              
            }
            if (magica!=15){
                bandera = false;
            }
            magica=0;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j){
                    magica = magica + matriz[i][j];
                }
                
            }                      
            
        }
        if (magica!=15){
                bandera = false;
            }
        return bandera;
                
    }
    
}
