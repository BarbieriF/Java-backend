/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia1;

import Entidad.Alquiler;
import Entidad.Velero;
import Servicio.ServicioAlquiler;

/**
 *
 * @author franc
 */
public class Herencia1 {

    public static void main(String[] args) {
        ServicioAlquiler sa = new ServicioAlquiler();
        Alquiler a = sa.seleccionarBarcoAlquiler();
        System.out.println(a.toString());
        System.out.println(a.costoFinalAlquiler());
    }
}
