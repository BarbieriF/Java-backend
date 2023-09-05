/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;



/**
 *
 * @author franc
 */
public class Velero extends Barco{
    private int numMastil;
    private String tipoBarco = "Velero";

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

    @Override
    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Velero{" + "numMastil=" + numMastil + '}';
    }     
       
    
    
    
}
