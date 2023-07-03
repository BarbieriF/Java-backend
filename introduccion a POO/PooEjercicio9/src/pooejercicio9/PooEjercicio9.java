/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ma = new MatematicaServicio();
        Matematica m1 = ma.iniciarNum();
        ma.devolverMayor(m1);
        System.out.println(ma.calcularPotencia(m1));
        System.out.println(ma.calcularRaiz(m1));
    }
    
}
