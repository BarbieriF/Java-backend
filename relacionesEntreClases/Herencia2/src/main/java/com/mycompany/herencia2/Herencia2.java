/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia2;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author franc
 */
public class Herencia2 {

    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        Televisor t = new Televisor();
        t.crearTelevisor();
        t.precioFinal();
        System.out.println(l.toString());
        System.out.println(t.toString());
    }
}
