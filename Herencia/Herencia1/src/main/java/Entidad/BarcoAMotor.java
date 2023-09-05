/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



/**
 *
 * @author franc
 */
public class BarcoAMotor extends Barco {
    protected int potencia;
    private String tipoBarco = "BarcoMotor";

    public BarcoAMotor(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String getTipoBarco() {
        return tipoBarco;
    }  
    
    

    @Override
    public String toString() {        
        return super.toString() + "BarcoAMotor{" + "potencia=" + potencia + '}';
    }

    
    
    
    
    
}
