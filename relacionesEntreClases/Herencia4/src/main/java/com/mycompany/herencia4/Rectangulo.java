/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia4;

/**
 *
 * @author franc
 */
public class Rectangulo implements calculosFormas {
    
    private double a;
    private double b;

    public Rectangulo(double a, double b) {
        this.a = a;
        this.b = b;
    }    
    

    @Override
    public double calcularArea() {
        double area = a*b;
        return  area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = a*2+b*2;
        return perimetro;
    }
    
    
}
