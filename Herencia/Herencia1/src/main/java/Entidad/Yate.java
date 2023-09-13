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
public class Yate extends BarcoMotor{
    private int numCamarotes;
    

    public Yate(int numCamarotes, int potencia, String matricula, int eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }    
    
    public static Yate crearYate(){
        Scanner leer = new Scanner(System.in);
        BarcoMotor b = BarcoMotor.crearBarcoMotor();
        System.out.println("ingrese el numero de camarotes");
        int camarotes = leer.nextInt();
        leer.nextLine();
        return new Yate(camarotes,b.getPotencia(),b.getMatricula(),b.getEslora(),b.getAnioFabricacion());
    }

    @Override
    public double costoAlquilerDiario() {
        double costo = super.costoAlquilerDiario();
        costo += numCamarotes;
        return costo;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + "Yate{" + "numCamarotes=" + numCamarotes + '}';
    }
    
    
    
}
