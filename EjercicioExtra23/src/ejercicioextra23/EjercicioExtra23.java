/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra23;

/**
 *
 * @author franc
 */
import java.util.Random;
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        String [] palabras = new String [9];
        palabras[0]="queso";
        palabras[1]="mate";
        palabras[2]="vaca";
        palabras[3]="yerba";
        palabras[4]="leche"; 
        palabras[5]="quiero";
        palabras[6]="entero";
        palabras[7]="sancor";
        palabras[8]="valido";
                
        
        char [][] sopa = new char [20][20];       
       
        for (char[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                sopa1[j] = ' ';                                           
            }
        }
        
        
        armarSopa(sopa,palabras);
        
        for (char[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa1[j] == ' ') {
                    sopa1[j] = (char)(random.nextInt(10)+'0');
                }                              
            }
        }
        
        for (char[] sopa1 : sopa) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print("[" + sopa1[j] + "]");                
            }
            System.out.println("");
        }
        
        
    }
    
    public static void armarSopa(char [][] sopa,String [] palabras){
        
        int posicionY;
        int posicionX;
        boolean valida = true;
        
        for (int i = 0; i < 9; i++ ) {
            int upperbound = 20-palabras[i].length();
            String palabra = palabras[i];
            posicionY=coordenadas(upperbound)[0];
            posicionX=coordenadas(upperbound)[1];
            for (int j = 0; j < palabra.length(); j++) {
                if (sopa[posicionY][posicionX+j] != ' '){
                    valida = false;
                    i--;
                }else{
                    valida =true;
                }
            }
            for (int k = 0; k < palabra.length(); k++) {
                    if (valida){
                    sopa[posicionY][posicionX+k]= palabra.charAt(k);
                    }                
                    
                }               
                        
        }
        
    }
    
    public static int [] coordenadas(int upperbound){
         Random rand = new Random(); 
         int [] coordenada = new int[2];       
            
            coordenada[0] = rand.nextInt(20);
            coordenada[1]= rand.nextInt(upperbound+1);
         return coordenada;
    }
    
}
