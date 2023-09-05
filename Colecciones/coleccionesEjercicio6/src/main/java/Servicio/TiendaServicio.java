 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class TiendaServicio {
    Scanner leer = new Scanner(System.in);
    HashMap < String , Double > productos = new HashMap();
    
    public Tienda crearProducto(){       
        System.out.println("ingrese nombre del producto");
        String nombreProducto = leer.nextLine();
        System.out.println("ingrese precio del producto");
        Double precio = leer.nextDouble();
        Tienda producto = new Tienda(nombreProducto, precio);        
        return producto;
    }    
    
    public void ingresarProducto(Tienda producto){        
        productos.put(producto.getProducto(), producto.getPrecio());        
    }
    
    public void modificarPrecio(String nombreProducto){
        if (productos.containsKey(nombreProducto)){
            System.out.println("ingrese el nuevo precio");
            Double precio = leer.nextDouble();
            productos.replace(nombreProducto, precio);
        }else{
            System.out.println("ese producto no se encuentra en stock");
        }
        
    }
    
    public void eliminarProducto(String nombreProducto){
        if (productos.containsKey(nombreProducto)){
            productos.remove(nombreProducto);
        }else{
            System.out.println("ese producto no se encuentra");
        }
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombreProducto = entry.getKey();
            Double precio = entry.getValue();
            
            System.out.println("producto "+nombreProducto+" precio $"+precio);
        }
    }
    
}
