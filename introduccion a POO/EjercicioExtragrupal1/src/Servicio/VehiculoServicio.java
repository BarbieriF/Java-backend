/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class VehiculoServicio {
    public Vehiculo crearVehiculo(){
        Scanner leer = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        System.out.println("ingrese la marca del vehiculo");
        v1.setMarca(leer.nextLine());
        System.out.println("ingrese modelo");
        v1.setModelo(leer.nextLine());
        System.out.println("ingrese el año");
        v1.setAnio(leer.nextInt());
        
        do {
            System.out.println("ingrese el tipo 1: auto, 2: motocicleta, 3:bicicleta");
            v1.setTipo(leer.nextInt());
        }while (v1.getTipo()!=1 && v1.getTipo()!=2 && v1.getTipo()!=3);
        
                
        return v1;
        
    }
    //regresa velocidad en segundos del vehiculo
    public double moverse(Vehiculo v1){
        switch (v1.getTipo()) {
            case 1:
                return 3;
            case 2:
                return 2;
            default:
                return 1;
        }
    }
    public int frenar(Vehiculo v1){
        if (v1.getTipo()!=3){
            return 2;
        }else{
            return 0;
        }
    }
    
}
