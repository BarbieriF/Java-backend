/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


import java.util.Random;

/**
 *
 * @author franc
 */
public class RevolverDeAgua {
    Random random = new Random();
    private int posicionTambor;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionTambor, int posicionAgua) {
        this.posicionTambor = posicionTambor;
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){        
        posicionAgua = random.nextInt(6)+1; 
        posicionTambor = random.nextInt(6)+1;              
    }
    
    public boolean mojar(){
        return posicionTambor == posicionAgua; 
    }
    
    public void sigienteChorro(){
        if (posicionTambor<6){
            posicionTambor++;
        }else{
            posicionTambor = 0;
        }
        
    }
    
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
