/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author franc
 */
import java.util.Scanner;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        
        System.out.println("ingrese 2 numeros enteros");
            float num=leer.nextInt();
            float num1=leer.nextInt();
            
        while (bandera){
            System.out.println("seleccione una opcion");
            System.out.println("op.1 sumar op.2 restar op.3 multiplicar op.4 dividir op.5 salir");
            int option=leer.nextInt();
            switch (option){
                case 1:
                    System.out.println("el resultado de la suma es "+(num+num1));
                    break;
                case 2:
                    System.out.println("el resultado de la resta es "+(num1-num));
                    break;
                case 3:
                    System.out.println("el producto de los numeros es "+(num*num1));
                    break;
                case 4:
                    System.out.println("el cociente de los numeros es "+(num/num1));
                    break;
                case 5:
                    System.out.println("desea salir del sistema s/n");
                    leer.nextLine();                            
                    String salir = leer.nextLine();
                    if (salir.equals("s")){
                        bandera=false;
                        break;
                    }else{
                        break;
                    }
                default:
                    System.out.println("la opcion ingresada no es valida");
            }
        }
        
    }
    
}
