/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author franc
 */
public class Arreglos {
   private double [] A;
   private double [] B;

    public Arreglos() {
    }
   
   

    public Arreglos(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    } 

    @Override
    public String toString() {
        return "Arreglos{" + "A=" + Arrays.toString(A) + ", B=" + Arrays.toString(B) + '}';
    }
      
      
   
}
