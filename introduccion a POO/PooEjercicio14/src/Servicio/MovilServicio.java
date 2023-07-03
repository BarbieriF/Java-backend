// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author franc
 */

public class MovilServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){        
        Movil m = new Movil(); 
        System.out.println("ingrese marca");
        m.setMarca(leer.nextLine());
        System.out.println("ingrese modelo");
        m.setModelo(leer.nextLine());
        System.out.println("ingrese precio");
        m.setPrecio(leer.nextDouble());
        System.out.println("ingrese memoria ram");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("ingrese almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        cargarCodigo(m);
        
        return m;
    }
    public void cargarCodigo(Movil m){
        int [] codigo = new int [7];
        
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("ingrese el numero "+(i+1)+" del codigo");
            codigo[i]= leer.nextInt();            
        }
        m.setCodigo(codigo);
    }
}
