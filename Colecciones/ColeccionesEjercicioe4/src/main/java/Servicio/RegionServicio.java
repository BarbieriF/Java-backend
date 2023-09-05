/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Region;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class RegionServicio {
    HashMap<Integer, String> regiones = new HashMap();
    Scanner leer = new Scanner(System.in);
    
    public void creacionLista(){
        regiones.put(4000, "San Miguel de Tucuman");
        regiones.put(4135, "El Mollar");
        regiones.put(4119, "Burruyacu");
        regiones.put(4113, "Leales");
        regiones.put(4107, "Yerba Buena");
        regiones.put(4124, "Trancas");
        regiones.put(4140, "Tafi del Valle");
        regiones.put(4162, "La Cocha");
        regiones.put(4128, "Lules");
        regiones.put(4103, "El Cadillal");
    }
    
    public Region crearRegion(){
        System.out.println("ingrese nombre de la region");
        String nombre = leer.nextLine();
        System.out.println("ingrese codigo postal");
        Integer codigo = leer.nextInt();
        Region region = new Region(nombre, codigo);
        return region;
    }
    
    public void listaPorTeclado(){
        Region region = crearRegion();
        regiones.put(region.getCodigo(), region.getNombre());
    }
    
    public void buscarPorCodigo(){
        System.out.println("ingrese un codigo postal");
        Integer codigo = leer.nextInt();
        boolean encontrado = false;
        for (Map.Entry<Integer, String> entry : regiones.entrySet()) {
            Integer key = entry.getKey();
            if(Objects.equals(key, codigo)){
                encontrado = true;
                System.out.println("el codigo pertenece a la ciudad "+entry.getValue());
            }            
            
        }
        if(!encontrado){
            System.out.println("el codigo ingresado no encuentra en el listado de ciudades");
        }
    }
    
    public void mostrarLista(){
        for (Map.Entry<Integer, String> entry : regiones.entrySet()) {
            System.out.println("codigo "+entry.getKey()+" ciudad "+entry.getValue());            
        }
    }
    
    public void eliminarCiudades(){
        System.out.println("ingrese tres ciudades");
        leer.nextLine();
        String c1 = leer.nextLine();
        String c2 = leer.nextLine();
        String c3 = leer.nextLine();
        
        Iterator <Map.Entry<Integer,String>> iterador = regiones.entrySet().iterator();
        
        while (iterador.hasNext()) {
            Map.Entry<Integer, String> region = iterador.next();
            if(region.getValue().equalsIgnoreCase(c3) || region.getValue().equalsIgnoreCase(c2) || region.getValue().equalsIgnoreCase(c1)){
                iterador.remove();
            }
        }
        
    }
    
}
