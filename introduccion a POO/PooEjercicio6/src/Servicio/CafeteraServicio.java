/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class CafeteraServicio {
    
    //metodo para crear cafetera
    public Cafetera crearCafetera(){
        Cafetera ca = new Cafetera(1000,0);        
        return ca;
    }
    
    public void llenarCafetera(Cafetera ca){
        ca.setCantidadActual(ca.getCantidadMaxima());
        System.out.println("se llenó la cafetera");
    }
    
    public void servirTaza(Cafetera ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la capacidad de su taza");
        double taza = leer.nextDouble();
        
        if (ca.getCantidadActual()>= taza){
            System.out.println("se lleno su taza");
            ca.setCantidadActual(ca.getCantidadActual()-taza);
        }else if(ca.getCantidadActual() > 0){
            System.out.println("lo siento no se pudo llenar la taza");
            System.out.println("le servimos "+ca.getCantidadActual()+" cm^3 de cafe");
            ca.setCantidadActual(0);
        }else{
            System.out.println("lo sentimos no queda cafe");
        }        
        
    }
    
    public void vaciaCafetera(Cafetera ca){
        ca.setCantidadActual(0);
        System.out.println("se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("indique la cantidad de cafe que desea agregar");
        double recarga = leer.nextDouble();
        if (ca.getCantidadActual()== ca.getCantidadMaxima()){
            System.out.println("la cafetera está llena, no puede agregar mas cafe");
        }else if(ca.getCantidadActual()+recarga > ca.getCantidadMaxima()){
            System.out.println("lo siento eso excede la capacidad de la cafetera intente con "+(ca.getCantidadMaxima()-ca.getCantidadActual())+" o menos.");
        }else{
            ca.setCantidadActual(ca.getCantidadActual()+recarga);
            System.out.println("se agrego el cafe, la cafetera se encuentra al "+((ca.getCantidadActual()*100)/ca.getCantidadMaxima())+"%");
        }
    }
    
}
