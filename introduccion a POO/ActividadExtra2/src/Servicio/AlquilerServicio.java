/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import actividadextra2.newpackage.Alquileres;
import actividadextra2.newpackage.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in);

    public Alquileres CrearAlquileres(Pelicula[] p) {
        Alquileres a1 = new Alquileres();
        System.out.println("Escriba el título de la película a alquilar");        
        a1.setPeliculaAlquilada((leer.nextLine()));
        for (Pelicula p1 : p) {
            if (p1.getTitulo().equalsIgnoreCase(a1.getPeliculaAlquilada())) {
                p1.setDisponible(false);
                break;
            }
        }
        
        System.out.println("Escriba la fecha de inicio del alquiler");        
        System.out.println("Ingrese la fecha de la película así; AAAA/MM/DD");
        System.out.println("ingrese el año");
        int anio = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el día");
        int dia = leer.nextInt();
        leer.nextLine();
        a1.setFechaInicio(LocalDate.of(anio,mes,dia));
        System.out.println("Escriba la fecha de fin del alquiler");
        System.out.println("Ingrese la fecha de la película así; AAAA/MM/DD");
        System.out.println("ingrese el año");
        anio = leer.nextInt();
        System.out.println("ingrese el mes");
        mes = leer.nextInt();
        System.out.println("ingrese el día");
        dia = leer.nextInt();
        a1.setFechaFin(LocalDate.of(anio,mes,dia));
        calcularPrecio(a1); 
        return a1; 
    }
    
    
    public void calcularPrecio(Alquileres a1){
        
        int diferenciaDias = (int)ChronoUnit.DAYS.between(a1.getFechaInicio(), a1.getFechaFin());
        if (diferenciaDias<=3){
            a1.setPrecio(10);
        }else {
            a1.setPrecio(10+(diferenciaDias-3));
        }

        // Mostrar la diferencia de días
        System.out.println("La diferencia de días es: " + diferenciaDias);
    }
    
    public void listarAlquidas(String [] p){
        System.out.println(Arrays.toString(p));
    }

}
