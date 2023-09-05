/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author franc
 */
public class Simulador {
    String [] nombres = {"pablo","juan","sofia","maria","agustin","marcos","belen","rocio","antonella","hector","martin","jose","javier","jessi","blanco","laura","pedro","enrique","leonardo","fernando","fernanda"};
    ArrayList<Pelicula>peliculas;
    ArrayList<Espectador> espectadores;
    HashMap<String,Espectador> butacas;
    Random random = new Random();    
    Pelicula p1 = new Pelicula("duro de matar", 120, 13, "bruce");
    
    public void crearEspectadores(int n){
        espectadores = new ArrayList();
        int i=0;
        while(i<n){
            Espectador e = new Espectador(nombres[random.nextInt(21)], random.nextInt(60)+6, random.nextInt(105)+50.5);
            espectadores.add(e);
            i++;
        }
    }
    
    public void crearSala(){
        butacas = new HashMap();
        String [] butaca = {"A","B","C","D","E","F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                butacas.put(butaca[j]+(i+1), new Espectador("", 0, 0));
            }            
        }     
    }
    /**
     * metodo temporal para agregar peeliculas
     */
    public void seleccionarPelicula(){
        peliculas = new ArrayList();
        p1 = new Pelicula("duro de matar", 120, 13, "bruce");
        peliculas.add(p1);       
        
    }
    
    Cine cine = new Cine(butacas, p1, 120);
    
    public boolean hayLugar(Espectador espectador){
        Espectador nulo = new Espectador("", 0, 0);
        for (Map.Entry<String, Espectador> entry : butacas.entrySet()) {
            String key = entry.getKey();
            Espectador val = entry.getValue();
            if(val.equals(nulo)){
                if(cine.getCartelera().getEdadMinima()<= espectador.getEdad() && cine.getPrecioEntrada()<= espectador.getDinero()){
                    butacas.put(key, espectador);
                    return true;
                }else{
                    System.out.println("No tiene dinero o edad para ver esta pelicula");
                    break;
                }
                
            }
        }
        return false;
    }
    
    public void llenarSala(){
        for (Espectador espectador : espectadores) {
            if(hayLugar(espectador)){
                System.out.println("Espectador "+espectador.getNombre()+" ingresado");
            }else{
                System.out.println("lo sentimos no hay lugar disponible");
            }
        }
    }
    
    public void mostrarSala(){
        for (Map.Entry<String, Espectador> entry : butacas.entrySet()) {
            String key = entry.getKey();
            Espectador val = entry.getValue();
            System.out.println(key+" "+val.getNombre());
        }
    }
}
