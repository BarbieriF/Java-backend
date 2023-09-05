/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionesentreclases;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class RelacionesEntreClases {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);       
        Juego juego = new Juego();
        
        ArrayList <Jugador> jugadores = new ArrayList();
        
        System.out.println("ingresee la cantidad de jugadores");
        int n = leer.nextInt();
        if (n>6){
            n=6;
        }
        for (int i = 0; i < n; i++) {
            Jugador j = new Jugador(i+1);
            jugadores.add(j);
        }
        
        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();
        
        juego.llenarJuego(jugadores, r);
        juego.ronda();
        
    }
}
