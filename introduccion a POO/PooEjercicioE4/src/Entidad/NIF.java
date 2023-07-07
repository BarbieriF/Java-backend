/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author franc
 */
public class NIF {
    private int DNI;
    private char nif;

    public NIF() {
    }

    public NIF(int DNI, char nif) {
        this.DNI = DNI;
        this.nif = nif;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getNif() {
        return nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", nif=" + nif + '}';
    }
    
    
}
