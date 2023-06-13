/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz1 = new int [3][3];        
        
        llenarMatriz(matriz1);   
        mostrarMatriz(matriz1);
        System.out.println("");
        System.out.println("la matriz ingresada es antisimetrica? "+esAntisimetrica(matriz1));
        
        
    }
    
    public static void llenarMatriz(int [][] matriz ){
        Scanner leer = new Scanner(System.in);
        for (int [] fila  : matriz) {
            for (int i = 0; i < fila.length; i++) {
                fila[i]= leer.nextInt();             
            }            
        }
    }
    
    public static void mostrarMatriz(int [][] matriz ){
        for (int [] fila  : matriz) {
            System.out.println("");
            for (int j : fila) {
                System.out.print("["+j+"]");           
            }            
        }
    }
    
    public static boolean esAntisimetrica(int [][]matriz){
        boolean bandera = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               if (!(matriz[i][j] == - matriz[j][i])){
                   bandera=false;
               }                
            }            
        }
        return bandera;
    } 
    
}
