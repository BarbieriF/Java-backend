/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



/**
 *
 * @author franc
 */
public class Yate extends BarcoAMotor{
    private int numCamarotes;
    private String tipoBarco = "Yate";

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

    @Override
    public String getTipoBarco() {
        return tipoBarco;
    }  

    
    
    @Override
    public String toString() {
        return super.toString() + "Yate{" + "numCamarotes=" + numCamarotes + '}';
    }
    
    
    
}
