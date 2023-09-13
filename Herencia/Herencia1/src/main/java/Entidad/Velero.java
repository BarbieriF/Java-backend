/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;



/**
 *
 * @author franc
 */
public class Velero extends Barco{
    private int numMastil;
    

    public Velero(int numMastil, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastil = numMastil;
    }

    public int getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(int numMastil) {
        this.numMastil = numMastil;
    }  
    
    public static Velero crearVelero(){
        Scanner leer = new Scanner(System.in); 
        Barco b = Barco.crearBarco();
        System.out.println("ingrese numero de mastiles");
        int mastil = leer.nextInt();
        return new Velero(mastil,b.getMatricula(),b.getEslora(),b.getAnioFabricacion());
    }

    @Override
    public double costoAlquilerDiario() {
        Double valor = super.costoAlquilerDiario();
        valor += numMastil;
        return valor;      
    } 
    
    

    @Override
    public String toString() {
        return super.toString() + "Velero{" + "numMastil=" + numMastil + '}';
    }     
       
    
    
    
}
