/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el valor en euros que quiera convertir");
        double dinero = leer.nextFloat();
        leer.nextLine();
        String divisas = leer.nextLine();        
        
        conversor(dinero,divisas);
    }
    
    public static void conversor (double dinero,String divisas){
        switch (divisas) {
            case "$":
                dinero = dinero*1.28611;
                System.out.println("equivalen a "+dinero+divisas);
                break;
            case "libras":
                dinero = dinero*0.86;
                System.out.println("equivalen a "+dinero+" "+divisas);
                break;
            default:
                dinero = dinero*129.852;
                System.out.println("equivalen a "+dinero+" "+divisas);
                break;
        }
    }
    
}
