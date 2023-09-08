/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia4;

/**
 *
 * @author franc
 */
public class Herencia4 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 10);
        Circulo c1 = new Circulo(2);
        System.out.println("el area de la figura r1 es "+r1.calcularArea()+" el area de c1 es "+c1.calcularArea());
        System.out.println("el perimetro de la figura r1 es "+r1.calcularPerimetro()+" el perimetro de c1 es "+c1.calcularPerimetro());
    }
}
