/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ServicioCliente {
    Scanner leer = new Scanner(System.in);
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    public Cliente crearCliente(){
        System.out.println("ingrese los datos del cliente");        
        System.out.println("ingrese id");
        int id = leer.nextInt();
        System.out.println("ingrese nombre");
        String nombre = leer.next();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        System.out.println("ingrese altura");
        int altura = leer.nextInt();
        System.out.println("ingrese peso");
        double peso = leer.nextDouble();
        leer.nextLine();
        System.out.println("ingrese objetivo");        
        String objetivo = leer.nextLine();
        
        Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
        return cliente;
    }
    
    public void pruebaClientes(){
        Cliente cliente1 = new Cliente(123, "marco", 25, 180, 95, "bajar 10 kilos");
        Cliente cliente2 = new Cliente(124, "Mara", 30, 165, 60, "pasar de 10km a 15km");
        Cliente cliente3 = new Cliente(125, "Elsa", 26, 170, 60, "ganarle a Mara");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
    }
    
    public void registrarClientes(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    public ArrayList obtenerCliente(){
        return listaClientes;
    }
    
    public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo ){
        listaClientes.forEach();
    }
    
}
