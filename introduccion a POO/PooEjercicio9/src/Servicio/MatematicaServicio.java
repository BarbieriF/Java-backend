/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class MatematicaServicio {
    public Matematica iniciarNum(){
        Scanner leer = new Scanner(System.in);
        Matematica ma = new Matematica();
        System.out.println("ingrese un numero real");
        ma.setNum1(leer.nextDouble());
        System.out.println("ingrese otro numero");
        ma.setNum2(leer.nextDouble());
        return ma;
    }
    
    public double devolverMayor(Matematica ma){
        if (ma.getNum1() < ma.getNum2()){
            System.out.println("el segundo numero es mayor");
            return ma.getNum2();
        }else{
            System.out.println("el primer numero es mayor");
            return ma.getNum1();
        }
    }
    
    public double devolverMenor(Matematica ma){
        if (ma.getNum1() < ma.getNum2()){            
            return ma.getNum1();
        }else{           
            return ma.getNum2();
        }
    }
    
    public double calcularPotencia(Matematica ma){
        double potencia;
        if (ma.getNum1() < ma.getNum2()){
            potencia = Math.pow(Math.round(ma.getNum2()), Math.round(ma.getNum1())); 
        }else{
            potencia = Math.pow(Math.round(ma.getNum1()), Math.round(ma.getNum2()));
        }
        return potencia;
    }
    
    public double calcularRaiz(Matematica ma){
        double raiz = Math.sqrt(Math.abs(devolverMenor(ma)));
        return raiz;
    }
    
}
