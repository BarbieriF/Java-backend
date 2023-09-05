/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionesentreclases3;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class RelacionesEntreClases3 {

    public static void main(String[] args) {
        String [] palo = {"espadas","bastos","oros","copas"};
        ArrayList<Carta> cartas = new ArrayList();
        for (int j = 0; j < 4; j++) {
            
            for (int i = 0; i < 12; i++){
                if(i==7 || i==8){
                continue;
                }
                Carta c = new Carta(i+1,palo[j]);
                cartas.add(c);
            }
            
        }
        Baraja baraja = new Baraja(cartas);
        baraja.mostrarBaraja();
        baraja.barajar();
        baraja.cartasMonton();
        baraja.darCartas(5);
        System.out.println("");
        baraja.cartasMonton();
        System.out.println("");
        System.out.println(baraja.siguienteCarta()); 
        System.out.println("");
        baraja.darCartas(10);
        System.out.println("");
        baraja.mostrarBaraja();
    }
}
