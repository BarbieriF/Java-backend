/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ServicioAlquiler {   
   Scanner leer = new Scanner(System.in);
   
    public Alquiler seleccionarBarcoAlquiler(){
        System.out.println("-----------------------------------------");        
        System.out.println("--------- seleccione un barco -----------");
        System.out.println("1* barco simple");
        System.out.println("2* barco motor");
        System.out.println("3* velero");
        System.out.println("4* Yate");
        int op = leer.nextInt();
        leer.nextLine();
        switch (op) {
            case 1:
                Barco b = Barco.crearBarco();
                Alquiler l = Alquiler.crearAlquiler(b);
                return l;
            case 2:
                BarcoMotor bm = BarcoMotor.crearBarcoMotor();
                Alquiler l2 = Alquiler.crearAlquiler(bm);
                return l2;
            case 3:
                Velero v = Velero.crearVelero();
                Alquiler l3 = Alquiler.crearAlquiler(v);
                return l3;
            case 4:
                Yate y = Yate.crearYate();
                Alquiler l4 = Alquiler.crearAlquiler(y);
                return l4; 
            default:
                System.out.println("opcion invalida");
                return null;
        }
    }
    
}
