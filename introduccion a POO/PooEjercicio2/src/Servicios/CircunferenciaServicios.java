/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class CircunferenciaServicios {
    
    public Circunferencia crearCircunferencia(){
        
        //instancia un objeto
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el valor del radio");
        //ingreso el atributo por teclado
        c1.setRadio(leer.nextDouble());
        
        return c1;        
    }
    
    public double area(Circunferencia c1){
        double area = Math.PI * Math.pow(c1.getRadio(), 2);
        return area;
    }
    
    public double perimetro(Circunferencia c1){
        double perimetro = Math.PI * c1.getRadio()*2;
        return perimetro;
    }
    
    public void mostrarInfo(double area, double perimetro){
        System.out.println("el valor del area para esta circunferencia es "+area+" y su perimetro es "+perimetro);
    }
        
}
