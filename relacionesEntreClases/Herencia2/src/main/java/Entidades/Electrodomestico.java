/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    public char comprobarConsumoEnergetico(char consumo){
        if(consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' || consumo == 'E' || consumo == 'F' ){
            System.out.println("Consumo enrgetico= "+consumo);
        }else{
           System.out.println("el valor ingresado no es correcto se asigno F por defecto");
           consumo = 'F';
            
        }
        return consumo;
    }
    
    public String comprobarColor(String color){
        if(color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris") ){
            System.out.println("color= "+color);
        }else{
            System.out.println("el color es invalido se asigno blanco por defecto");
            color = "blanco";
            
        }
        return color;
    }
    
    public void crearElectrodomestico(){
        System.out.println("ingrese el color");
        color = comprobarColor(leer.nextLine());
        System.out.println("ingrese el eficiencia");
        consumoEnergetico = comprobarConsumoEnergetico(leer.nextLine().charAt(0));
        precio = 1000;
        System.out.println("ingrese peso");
        peso = leer.nextDouble();             
    }
    
    public void precioFinal(){
        switch (consumoEnergetico) {
            case 'A':
                precio+=1000;
                break;
            case 'B':
                precio+=800;
                break;
            case 'C':
                precio+=600;
                break;
            case 'D':
                precio+=500;
                break;
            case 'E':
               precio+=300;
                break;
            case 'F':
                precio+=100;
                break;                
        }
        
        if (peso >= 1 && peso <= 19){
            precio+=100;
        }else if(peso >= 20 && peso<= 49){
            precio+=500;
        }else if(peso >= 49 && peso <=79){
            precio+=800;
        }else if (peso >=80){
            precio+=1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }
    
    
}
