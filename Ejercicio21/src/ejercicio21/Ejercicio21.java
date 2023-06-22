/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author ASUS
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 36, 5, 67, 41, 22, 67, 20, 10, 61},
            {56, 89, 91, 75,  9, 90, 17, 12, 87, 67},
            {41, 14, 22, 26, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };
        
        int [][] N = {{36,5,67},{89,90,75},{14,22,26}};
        
        System.out.println("las coordenadas de inicio de la matriz N dentro de M son "+coordenadas(M,N)[0]+" "+coordenadas(M,N)[1]);
        
        
    }
    
    public static int[] coordenadas(int[][] M, int [][]N){
        int[]coordenada = new int [2];
                
        for (int i = 0; i <= 7; i++){
            for (int j = 0; j <= 7; j++) {
                boolean contiene=true;
                for (int k = 0; k < N.length; k++) {
                    for (int m = 0; m < N.length; m++) {
                        if (M[i+k][j+m]!=N[k][m]){
                            contiene=false;
                            break;                            
                        }                             
                                                
                    }
                    if (!contiene){
                        break;
                    }
                }
                if(contiene){
                    coordenada[0] = i;
                    coordenada[1] = j;
                }
                                    
            }
        }
        return coordenada;
        
    }
    
}
