/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class OperacionServicio {
    //genera una instancia del objeto
    Operacion op = new Operacion(); 
    
    
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        op.setNum1(leer.nextInt());
        op.setNum2(leer.nextInt());     
        return op;
    }
    
    public int sumar(Operacion op){
        int suma = op.getNum1()+op.getNum2();
        return suma;
    }
    
    public int restar(Operacion op){
        int resta = op.getNum1()-op.getNum2();
        return resta;
    }
    
    public int multiplicar(Operacion op){
        if (op.getNum1()==0 || op.getNum2()==0 ){
            System.out.println("multiplicar solo permite numeros distintos de 0");
            return 0;
        }else{
            int producto = op.getNum1()*op.getNum2();
            return producto;
        }
        
    }
    public double dividir(Operacion op){
        if (op.getNum1()==0 || op.getNum2()==0){
            System.out.println("dividir solo permite numeros distintos de 0");
            return 0;
        }else{
            double cociente = op.getNum1();
            cociente = cociente/op.getNum2();
            return cociente;
        }
    } 
    
}
