/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ServicioNIF {
    Scanner leer = new Scanner(System.in);
    public NIF crearNif(){
        NIF n = new NIF();
        char [] tabla = {'T', 'R', 'w','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};         
        System.out.println("ingrese su numero de DNI");
        n.setDNI(leer.nextInt());        
        n.setNif(tabla[n.getDNI()%23]);
        return n;
    }
    
    public void mostrar(NIF n){
        System.out.println("el codigo NIF es "+n.getDNI()+"-"+n.getNif());
    }
}
