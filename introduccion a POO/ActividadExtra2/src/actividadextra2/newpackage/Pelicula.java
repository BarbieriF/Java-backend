/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra2.newpackage;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private String genero;
    private LocalDate fecha;
    private int duracion;
    private boolean disponible;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, LocalDate fecha, int duracion, boolean disponible) {
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", fecha=" + fecha + ", duracion=" + duracion + ", disponible=" + disponible + '}';
    }

   

}
