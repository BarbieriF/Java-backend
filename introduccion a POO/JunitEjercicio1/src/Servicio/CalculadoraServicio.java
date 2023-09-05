/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import CalculadoraDescuentos.Calculadora;

/**
 *
 * @author franc
 */
public class CalculadoraServicio {
    public double precioConDescuento(Calculadora c){
        return c.getPrecio()*(1-c.getDescuento()/100);
    }
}
