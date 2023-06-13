/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        
        int n = leer.nextInt();
        
        int [] vector = new int[n];
        llenarMatriz(vector,n);
        mostrarMatriz(vector,n);
        
        System.out.println("ingrese un numero del 0 al 9");
        
        int num = leer.nextInt();
        buscador(vector,n,num);
        
    }
    
    public static void llenarMatriz(int [] vector,int n){
        for (int i = 0; i<n ; i++){
            vector[i]= (int) (Math.random()*10);
        }
    }
    
    public static void mostrarMatriz(int [] vector, int n){
        for (int i = 0; i < n ; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
        System.out.println("");
    }
    
    public static void buscador (int[]vector,int n,int num){
        
        for (int i = 0; i < n; i++) {
            if (vector[i]==num){
                System.out.println("el numero fue encontrado en la posicion "+i);            
            } 
            
        }
                
        
    }
     
}
