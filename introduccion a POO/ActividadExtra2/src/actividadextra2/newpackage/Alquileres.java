/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra2.newpackage;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Alquileres {

    private String peliculaAlquilada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int precio;

    public Alquileres() {
    }

    public Alquileres(String peliculaAlquilada, LocalDate fechaInicio, LocalDate fechaFin, int precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquileres{" + "peliculaAlquilada=" + peliculaAlquilada + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + '}';
    }
    
    

}
