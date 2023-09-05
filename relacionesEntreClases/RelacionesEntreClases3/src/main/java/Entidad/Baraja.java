/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import static java.util.Collections.shuffle;


/**
 *
 * @author franc
 */
public class Baraja {
    private ArrayList <Carta> baraja;
    private ArrayList <Carta> entregadas = new ArrayList();

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public void barajar(){
        shuffle(baraja);         
    }
    
    public Carta siguienteCarta(){
       return baraja.get(0);
    }
    
    public void cartasDisponibles(){
        baraja.size();
    }
    
    public int darCartas(int n){
        
        if (baraja.size()>=n){
            for (int i = 0; i < n; i++) {
                entregadas.add(baraja.get(i));
                baraja.remove(i);
            }
        }else{
            System.out.println("no hay suficientes cartas");
            return 0;
        }
        return entregadas.size();
    }
    
    public void cartasMonton(){
        if(entregadas.isEmpty()){
            System.out.println("aun no se repartieron cartas");
        }else{
            for (Carta carta : entregadas) {
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
    
}
