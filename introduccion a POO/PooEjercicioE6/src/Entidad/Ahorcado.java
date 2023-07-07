/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author franc
 */
public class Ahorcado {
    private String [] buscar;
    private int letrasEncotradas;
    private int maxIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int letrasEncotradas, int maxIntentos) {
        this.buscar = buscar;
        this.letrasEncotradas = letrasEncotradas;
        this.maxIntentos = maxIntentos;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getLetrasEncotradas() {
        return letrasEncotradas;
    }

    public void setLetrasEncotradas(int letrasEncotradas) {
        this.letrasEncotradas = letrasEncotradas;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setMaxIntentos(int maxIntentos) {
        this.maxIntentos = maxIntentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscar=" + Arrays.toString(buscar) + ", letrasEncotradas=" + letrasEncotradas + ", maxIntentos=" + maxIntentos + '}';
    }

    
    
}
