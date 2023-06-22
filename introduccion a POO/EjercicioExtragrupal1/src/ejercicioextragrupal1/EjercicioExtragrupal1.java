//ejercicio 1
//Moverse: Es la cantidad de metros que avanzará por segundo.
//Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
//más metros.
//Un automóvil avanza 3 metros por segundo.
//Una motocicleta avanza 2 metros por segundo.
//Una bicicleta avanza 1 metro por segundo.
//Crear una clase "Vehículo" con atributos como "marca"
//,
//"modelo"
//,
//"año" y "tipo" (En tipo, vamos a indicar si es un
//automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
//Referencias:
//-
//Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
//pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
//vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
//avanzó
package ejercicioextragrupal1;

import Entidad.Vehiculo;
import Servicio.VehiculoServicio;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class EjercicioExtragrupal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        VehiculoServicio vs = new VehiculoServicio();
        
        Vehiculo v1 = vs.crearVehiculo();
        Vehiculo v2 = vs.crearVehiculo();
        Vehiculo v3 = vs.crearVehiculo();
        
        boolean bandera = true;
        
        while (bandera) {            
            System.out.println("ingrese el tiempo en segundos");
            int time = leer.nextInt();
            double distancia1 = vs.moverse(v1)*time+vs.frenar(v1);
            double distancia2 = vs.moverse(v2)*time+vs.frenar(v2);
            double distancia3 = vs.moverse(v3)*time+vs.frenar(v3);
            
            System.out.println("la distancia recorrida por el vehiculo 1 es: "+distancia1+" por el vehiculo 2 es: "+distancia2+" por el vehiculo 3 "+distancia3);
            
            System.out.println("quiere realizar otro calculo? 1: si 2:salir");
            if (leer.nextInt()== 2){
                bandera=false;
            }
        }
        
    }
    
}
