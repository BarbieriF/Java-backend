/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author franc
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> comparaDuracion = (Pelicula peli1, Pelicula peli2) -> peli1.getDuracion().compareTo(peli2.getDuracion());
    
    public static Comparator<Pelicula> comparaTitulo = (Pelicula peli1, Pelicula peli2) -> peli1.getTitulo().compareTo(peli2.getTitulo());
    
    public static Comparator<Pelicula> comparaDirector = (Pelicula peli1, Pelicula peli2) -> peli1.getDirector().compareTo(peli2.getDirector());
    
}
