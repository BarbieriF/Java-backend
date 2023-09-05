/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



import java.util.HashMap;

/**
 *
 * @author franc
 */
public class Cine {
    private HashMap<String,Espectador> sala;
    private Pelicula cartelera;
    private double precioEntrada; 

    public Cine() {
    }   
    

    public Cine(HashMap<String,Espectador> sala, Pelicula cartelera, double precioEntrada) {
        this.sala = sala;
        this.cartelera = cartelera;
        this.precioEntrada = precioEntrada;
    }
        

    public Pelicula getCartelera() {
        return cartelera;
    }

    public void setCartelera(Pelicula cartelera) {
        this.cartelera = cartelera;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }        
        

    public HashMap<String,Espectador> getSala() {
        return sala;
    }

    public void setSala(HashMap<String, Espectador> sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", cartelera=" + cartelera + ", precioEntrada=" + precioEntrada + '}';
    }   
    
    
    
    
}
