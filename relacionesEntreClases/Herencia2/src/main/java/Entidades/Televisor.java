/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franc
 */
public class Televisor extends Electrodomestico {
    private double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor(){        
        super.crearElectrodomestico();
        System.out.println("ingrese resolucion");
        resolucion = leer.nextDouble();
        System.out.println("ingrese 1 si tiene sintonizador, ingrese 2 si no esta incluido");
        int op = leer.nextInt();
        sintonizador = op==1;        
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(resolucion > 40){
            precio = precio*1.3;            
        }
        if(sintonizador){
            precio+= 500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
}
