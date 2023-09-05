/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoAMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author franc
 */
public class ServicioAlquiler {
    Alquiler alquiler;
    Scanner leer = new Scanner(System.in);
    
    public Alquiler crearAlquiler(){
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
        System.out.println("ingrese el tipo de barco Velero, BarcoMotor, Yate");        
        alquiler = new Alquiler(nombre, documento, fechaInicio, fechaDevolucion, posicionAmarre, crearBarco(leer.nextLine()));
        return alquiler;
    }
    
    public Barco crearBarco(String tipoBarco){
        Barco barco = new Barco(tipoBarco, 0, 0);
        switch (tipoBarco) {
            case "Velero":
                System.out.println("ingrese numero de mastils");
                int n = leer.nextInt();
                barco = new Velero(n, tipoBarco, 10+(n*3), 2000);
                break;
            case "BarcoMotor":
                barco = new BarcoAMotor(50, tipoBarco, 30, 2010);
                break;
            case "Yate":
                System.out.println("ingrese numero de camarotes");
                n = leer.nextInt();
                barco = new Yate(n, n*50, tipoBarco, 20+(n*5), 2020);
                break;            
        }
        return barco;
    }
    
    public void costoAlquiler(){
        double costo;
        switch (alquiler.getBarco().getTipoBarco()) {
            case "Velero":
                costo = (double)ChronoUnit.DAYS.between(alquiler.getFechaDevolucion(), alquiler.getFechaInicio()) + ((Velero) alquiler.getBarco().ge) ;
            case "BarcoMotor":
                costo = (double)ChronoUnit.DAYS.between(alquiler.getFechaDevolucion(), alquiler.getFechaInicio());
            case "Yate":
                costo = (double)ChronoUnit.DAYS.between(alquiler.getFechaDevolucion(), alquiler.getFechaInicio());
        }
        
        
    }
    
}
