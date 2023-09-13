/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Alquiler {
    private String nombre;
    private int documento;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombre, int documento, LocalDate fechaInicio, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public static Alquiler crearAlquiler(Barco barco){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("ingrese documento");
        int documento = leer.nextInt();
        leer.nextLine();
        System.out.println("fecha de alquiler yyyy/mm/dd");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        LocalDate fechaInicio = LocalDate.of(anio, mes, dia);
        System.out.println("ingrese fecha de devolucion yyyy/mm/dd");
        anio = leer.nextInt();
        mes = leer.nextInt();
        dia = leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anio, mes, dia);
        System.out.println("ingrese num de puerto");
        int posicionAmarre = leer.nextInt();
        leer.nextLine();        
        
        return new Alquiler(nombre, documento, fechaInicio, fechaDevolucion, posicionAmarre, barco);        
    }
    
    
    public double costoFinalAlquiler(){
        return barco.costoAlquilerDiario()* ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre= " + nombre + ", documento= " + documento + ", fechaInicio= " + fechaInicio + ", fechaDevolucion= " + fechaDevolucion + ", posicionAmarre= " + posicionAmarre + ", barco= " + barco + '}';
    }
    
    
}
