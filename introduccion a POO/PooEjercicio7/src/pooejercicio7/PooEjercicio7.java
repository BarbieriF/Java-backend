/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author ASUS
 */
public class PooEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaServicio ps = new PersonaServicio();
       Persona p1 = ps.crearPersona();
       Persona p2 = ps.crearPersona();
       Persona p3 = ps.crearPersona();
       Persona p4 = ps.crearPersona();
       
       int p1IMC = ps.calcularIMC(p1);
       int p2IMC = ps.calcularIMC(p2);
       int p3IMC = ps.calcularIMC(p3);
       int p4IMC = ps.calcularIMC(p4);
       
       boolean p1E = ps.esMayorDeEdad(p1);
       boolean p2E = ps.esMayorDeEdad(p2);
       boolean p3E = ps.esMayorDeEdad(p3);
       boolean p4E = ps.esMayorDeEdad(p4);
       
       int [] IMC = new int [4];
       
       IMC[0]=p1IMC;
       IMC[1]=p2IMC;
       IMC[2]=p3IMC;
       IMC[3]=p4IMC;
       
       double bajo = 0;
       double ideal = 0;
       double sobre = 0;
       
       for (int i = 0; i < IMC.length; i++) {
           switch (IMC[i]) {
               case -1:
                   bajo++ ;
                   break;
               case 0:
                   ideal++;
                   break;            
               default:
                   sobre++;
                   break;
           }
       }
       
       double mayores = 0;
       boolean [] mayor = new boolean [4];
       mayor[0]= p1E;
       mayor[1]= p2E;
       mayor[2]= p3E;
       mayor[3]= p4E;
       
        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i]){
                mayores++;
            }
            
        }
        
        System.out.println("el porcentaje de gente con sobrepeso es "+sobre/4*100+"% el porcentaje de gente con peso ideal "+ideal/4*100
        +"% el porcentaje de gente con bajo peso "+bajo/4*100+"%");
       
    }
    
}
