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
public class BarcoMotor extends Barco {
    protected int potencia;
    

    public BarcoMotor(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public static BarcoMotor crearBarcoMotor(){
        Scanner leer = new Scanner(System.in);
        Barco b = Barco.crearBarco();
        System.out.println("ingrese la potencia del barco");
        int potenciaCV = leer.nextInt();
        leer.nextLine();
        return new BarcoMotor(potenciaCV,b.getMatricula(),b.getEslora(),b.getAnioFabricacion());
    }

    @Override
    public double costoAlquilerDiario() {
        double costo = super.costoAlquilerDiario();
        costo += potencia;
        return costo;
    }
    
    

    @Override
    public String toString() {        
        return super.toString() + "BarcoAMotor{" + "potencia=" + potencia + '}';
    }

    
    
    
    
    
}
