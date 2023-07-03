/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio11;
import java.util.Scanner;
//import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author franc
 */
public class PooEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el día");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el año");
        int anio = leer.nextInt();
       
//        Date fecha = new Date(anio-1900,mes-1,dia);
//        System.out.println(fecha);
//        Date fechaActual = new Date();
//        System.out.println(fechaActual.getYear() - fecha.getYear());
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        System.out.println(fecha);
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual.getYear()-fecha.getYear());
        
        
    }

    
    
}
