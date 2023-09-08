/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia2;

import Entidades.Lavadora;

/**
 *
 * @author franc
 */
public class Herencia2 {

    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        System.out.print(l.toString());
    }
}
