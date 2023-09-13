/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;



/**
 *
 * @author franc
 */
public class Barco {
    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;
    

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }   

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public static Barco crearBarco(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese matricula");
        String MatriculaPorTeclado = leer.nextLine();
        System.out.println("ingrese la eslora del barco");
        int esloraPorTeclado = leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese año de fabricacion");
        int anioFabricacionTeclado = leer.nextInt();
        leer.nextLine();
        return new Barco(MatriculaPorTeclado,esloraPorTeclado,anioFabricacionTeclado);               
    }
    
    public double costoAlquilerDiario(){
        double costoDiario = eslora *10;
        return costoDiario;
    }
    

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    
}
