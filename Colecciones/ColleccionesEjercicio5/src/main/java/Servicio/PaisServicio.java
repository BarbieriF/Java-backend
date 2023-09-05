/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class PaisServicio {
    Scanner leer = new Scanner(System.in);
    HashSet <Pais> conjuntoPaises;
    
    public HashSet<Pais> listarPaises(){
        boolean bandera= true;
        conjuntoPaises = new HashSet();        
        while (bandera) {
            System.out.println("ingrese 1 para ingrese un pais, ingrese 2 para salir ");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:                    
                    String pais = leer.nextLine();
                    Pais p1 = new Pais(pais);
                    conjuntoPaises.add(p1);
                    break;                   
                case 2:
                    System.out.println("saliendo");
                    bandera = false;
                    break;
            }
            
        }
        return conjuntoPaises;
    }
    
    public void mostrarLista(){
        ArrayList <Pais> listaPaises = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaises, Pais.ordenaPorNombreDesc);
        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(String nombre){
        Iterator<Pais> it = conjuntoPaises.iterator();
        boolean encontrado = true;
        while (it.hasNext()) {
            if(nombre.equals(it.next().getNombre())){
                it.remove();
                encontrado = true;
                break;
            }else{
                encontrado = false;
            }
            
        }
        if (!encontrado){
            System.out.println("lo siento ese pais no se encuentra en la lista");
        }
    }
}
