/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author franc
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }    
    

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("ingrese capacidad de carga");
        carga = leer.nextInt();
        leer.nextLine();       
              
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(carga>30){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString()+ "carga=" + carga + '}';
    }
    
    
    
}
