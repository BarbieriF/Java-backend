/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author franc
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int [4][4];
        int [][] transpuesta = new int [4][4];
        
        llenarMatriz(matriz);
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz1[j] + "]");                                
            }
            System.out.println("");  
        }
        System.out.println(""); 
        
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                transpuesta[i][j]= matriz[j][i];                
            }
            
        }
        for (int[] matriz2 : transpuesta){
            for (int j= 0; j < transpuesta.length; j++){
                System.out.print("["+matriz2[j]+"]");
            }
            System.out.println("");
        }
    }
    public static void llenarMatriz (int [][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (Math.random()*10);                
            }
            
        }
    }
}
