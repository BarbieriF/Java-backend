/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        
        int n = leer.nextInt();
        int [] prueba = new int[5];
        
        int [] vector = new int[n];
        for ( int i = 0; i<n ; i++){
            vector[i]= leer.nextInt();
        }   
        
        for ( int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");            
        }
        
        for (int i = 0; i < n; i++) {
            int contando = digitos(vector,n,i)-1;
            if (contando>=0 && contando<=4){
                prueba[contando]++;
            }
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("la cantidad de numeros de "+(i+1)+" cifras son "+prueba[i]);
            
        }
        

        
    }
    
    public static int digitos (int[] vector,int n,int i){
        if (vector[i]==0){
            return 1;
        }else{
            int cuenta=0;
            while(vector[i]>=1){
                vector[i]=vector[i]/10;
                cuenta++;
            }
            return cuenta;
        }
        
    }
            
}
