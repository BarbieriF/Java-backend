/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import static java.util.Collections.reverse;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList <Pelicula> listaPeliculas;
    
    /**
     * devuelve lista de peliculas
     * @return Arraylist pelicula
     */
    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }    
    /**
     * crea objeto pelicula
     * @return Pelicula
     */
    public Pelicula crearPelicula(){
        System.out.println("ingrese el titulo");
        String titulo = leer.nextLine();
        System.out.println("ingrese director");
        String director = leer.nextLine();
        System.out.println("ingrese duracion");
        double duracion = leer.nextDouble();
        
        Pelicula peli = new Pelicula(titulo, director, duracion);
        return peli;
    }
    /**
     * crea y agrega a una lista un objeto pelicula
     */
    public void agregarPeliculaLista(){
        boolean bandera = true;
        listaPeliculas = new ArrayList();
        while (bandera) {            
            System.out.println("ingrese 1 para cargar una pelicula");
            System.out.println("ingrese 2 para salir");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:                 
                    listaPeliculas.add(crearPelicula());
                    break;
                case 2:
                    System.out.println("saliendo");
                    bandera = false;
                    break;
            }
        }
    }
    public ArrayList<Pelicula> listaOrdenadaDuracionMenorAMayor(){
        listaPeliculas.sort(Pelicula.comparaDuracion);        
        System.out.println(listaPeliculas.toString());
        return listaPeliculas;
    }
    public ArrayList<Pelicula> listaOrdenadaDuracionMayorAMenor(){
        reverse(listaPeliculas);
        System.out.println(listaPeliculas.toString());
        return listaPeliculas;
    }
    
    public ArrayList<Pelicula> listaOrdenadaTitulo(){
        listaPeliculas.sort(Pelicula.comparaTitulo);
        System.out.println(listaPeliculas.toString());
        return listaPeliculas;        
    }
    
    public ArrayList<Pelicula> listaOrdenadaDirector(){
        listaPeliculas.sort(Pelicula.comparaDirector);
        System.out.println(listaPeliculas.toString());
        return listaPeliculas;        
    }
    
}
