/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author franc
 */

public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] vector = new int[100];                   
                
        llenarMatriz(vector);
        mostrarMatriz(vector);
        
    }
    
    public static void llenarMatriz(int [] vector){
        for (int i = 0; i<=99 ; i++){
            vector[i]=i+1;
        }
    }
    
    public static void mostrarMatriz(int [] vector){
        for (int i=99; i>=0;i--){
            System.out.print("["+vector[i]+"]");
        }
    }
    
}
