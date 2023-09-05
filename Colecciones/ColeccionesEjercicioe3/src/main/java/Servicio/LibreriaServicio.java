/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libreria;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class LibreriaServicio {
    HashSet<Libreria> libros = new HashSet();
    Scanner leer = new Scanner(System.in);
    
    public void crearlibro(){
        System.out.println("ingrese titulo");
        String titulo = leer.nextLine();
        System.out.println("ingrese autor");
        String autor = leer.nextLine();
        System.out.println("ingrese cantidad de ejemplares");
        int ejemplares = leer.nextInt();
        int ejemplaresPrestados = 0;
        Libreria libro = new Libreria(titulo, autor, ejemplares, ejemplaresPrestados);
        libros.add(libro);             
    }
    
    public void agregarLibros(Libreria libro){
        libros.add(libro);
    }
    public Libreria buscarLibro(String titulo){
        Libreria libroBuscado = new Libreria("", "", 0, 0);
        for (Libreria libro : libros) {
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }    
        return libroBuscado; 
    }
    
    public boolean prestamo(String titulo){
        Libreria libro = buscarLibro(titulo);
        boolean estado = false;
        if(!libro.equals(new Libreria("", "", 0, 0))){
            if(libro.getEjemplaresPrestados()<libro.getEjemplares()){
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                estado = true;                
            }else{                
                estado=false;
            }
        }else{
            System.out.println("el libro buscado no se encuenta en la libreria");
        }
        return estado;
    }
    
    public boolean debolucion(String titulo){
        Libreria libro = buscarLibro(titulo);
        boolean estado = false;
        if(!libro.equals(new Libreria("", "", 0, 0))){
            if(libro.getEjemplaresPrestados()>0){
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                estado = true;                
            }else{                
                estado=false;
            }
        }else{
            System.out.println("el libro buscado no se encuenta en la libreria");
        }
        return estado;
    }
    
    public void mostrarCatalogo(){
        for (Libreria libro : libros) {
            System.out.println(libro);
        }
    }
    
}
