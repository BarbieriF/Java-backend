/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author franc
 */
public class ArreglosServicio {
    
    public Arreglos llenarA(){
        Random random = new Random();
        Arreglos a = new Arreglos();
        double [] vector = new double [50];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= random.nextDouble()*100;            
        }
        a.setA(vector);
        
        for (int i = 0; i < a.getA().length; i++) {
            System.out.print("["+String.format("%.1f", a.getA()[i])+"]");            
        }
        System.out.println("");
        return a;
        
    }
    
    public void ordenarA(Arreglos a){
        Arrays.sort(a.getA(), 0, a.getA().length);
        for (int i = 0; i < a.getA().length; i++) {
            System.out.print("["+String.format("%.1f", a.getA()[i])+"]");            
        }
        System.out.println("");
    }
    
    public void llenarB(Arreglos a){
        double [] vector = new double [20];
        System.arraycopy(a.getA(), 0, vector, 0, 10);
        Arrays.fill(vector,10,20,0.5);
        a.setB(vector);
        for (int i = 0; i < a.getB().length; i++) {
            System.out.print("["+String.format("%.1f", a.getB()[i])+"]");            
        }
        
    }
    
}
