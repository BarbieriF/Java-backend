/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia4;

/**
 *
 * @author franc
 */
public class Circulo implements calculosFormas {
    private double r;

    public Circulo(double r) {
        this.r = r;
    } 
    


    @Override
    public double calcularArea() {
        double area = PI*(Math.pow(r, 2));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = PI*r*2;
        return perimetro;
    }
    
}
