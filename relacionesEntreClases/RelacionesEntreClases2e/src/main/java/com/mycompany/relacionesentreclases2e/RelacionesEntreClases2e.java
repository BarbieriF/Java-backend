/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionesentreclases2e;

import Servicio.Simulador;

/**
 *
 * @author franc
 */
public class RelacionesEntreClases2e {

    public static void main(String[] args) {
        String [][] sala = new String[8][6];
        String [] butaca = {"A","B","C","D","E","F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala [i][j] = butaca[j]+(i+1)+" ";          
            }            
        }       
        
        Simulador s = new Simulador();
        s.crearEspectadores(40);
        s.crearSala();
        s.seleccionarPelicula();
        s.llenarSala();
        s.mostrarSala();
        
    }
}
