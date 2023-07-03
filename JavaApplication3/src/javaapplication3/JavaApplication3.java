/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import Entidad.Cadena;
import Servicio.ServicioCadena;

/**
 *
 * @author ASUS
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCadena ca = new ServicioCadena();
        Cadena c1 = ca.crearCadena();
        ca.contarVocales(c1);
        ca.invertirfrase(c1);
        ca.invertirfrase(c1);
        ca.vecesRepetido(c1);
        ca.compararLongitud(c1);
        ca.reemplazar(c1);
        ca.unirFrase(c1);
    }
    
}
