/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import actividadextra2.newpackage.Pelicula;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
        
        public class PeliculaServicio{
    Scanner leer = new Scanner(System.in);
    public Pelicula CrearPelicula(){
        Pelicula p1 = new Pelicula();
        System.out.println("Ingrese el título de la película");
        p1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el género de la película");
        p1.setGenero(leer.nextLine());
        System.out.println("Ingrese la fecha de la película así; AAAA/MM/DD");
        System.out.println("ingrese el año");
        int anio = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el día");
        int dia = leer.nextInt();
        p1.setFecha(LocalDate.of(anio,mes,dia));
        System.out.println("Ingrese la duración de la película en minutos");
        p1.setDuracion(leer.nextInt());
        return p1; 
    }
    
    public void  ListarPeliculas(String [] p1){
        System.out.println(Arrays.toString(p1));
    }
}
