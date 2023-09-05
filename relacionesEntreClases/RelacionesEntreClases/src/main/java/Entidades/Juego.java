/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;


/**
 *
 * @author franc
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList jugadores, RevolverDeAgua r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void ronda(){
        while(true){
            for (Jugador jugador : jugadores) {
                if(jugador.disparo(revolver)){
                    System.out.println("game over el "+jugador.getNombre()+" esta mojado");
                    return;
                }
            }
        }
    }
}
