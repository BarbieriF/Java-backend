/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ServicioCadena {
    public Cadena crearCadena(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una o varias palabras");
        Cadena ca = new Cadena();
        ca.setFrase(leer.nextLine());
        ca.setLongitud(ca.getFrase().length());
        return ca;
    }
    
    public int contarVocales(Cadena ca){
        String [] palabras = new String [ca.getLongitud()];
        int vocales = 0;
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=ca.getFrase().substring(i, i+1);            
        }
        
        for (String palabra : palabras) {
            switch (palabra) {
                case "a":
                    vocales++;
                    break;
                case "e":
                    vocales++;
                    break;
                case "i":
                    vocales++;
                    break;
                case "o":
                    vocales++;
                    break;
                case "u":
                    vocales++;
                    break;                
            }
            
        }
        return vocales;
        
    }
    
    public void invertirfrase(Cadena ca){
        String [] palabras = new String [ca.getLongitud()];
        int j = palabras.length;
        String palabra ="";
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=ca.getFrase().substring(j-1, j);
            j--;
        }
        
        for (String palabra1 : palabras) {
            palabra = palabra + palabra1;            
        }
        ca.setFrase(palabra);
        System.out.println(palabra);
    }
    
    public void vecesRepetido(Cadena ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una letra");
        String letra = leer.nextLine();
        
        String [] palabras = new String [ca.getLongitud()];
        int repetido = 0;
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=ca.getFrase().substring(i, i+1);            
        }
        
        for (String palabra : palabras) {
            if (palabra.equals(letra)) {
                repetido++;                 
            }
        }
        
        if (repetido==0){
          System.out.println("la letra no se encontro");
        }else{
          System.out.println("la letra se encontro "+repetido+" veces");  
        }
        
    }
    
    public void compararLongitud(Cadena ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese otra frase o palabra");
        String nuevaPalabra = leer.nextLine();
        if (ca.getLongitud()<nuevaPalabra.length()){
            System.out.println("la longitud de la nueva frase es mayo");
        }else{
            System.out.println("la longitud de la nueva frase es menor");
        }
    }
    
    public void unirFrase(Cadena ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese otra frase o palabra");
        String nuevaPalabra = leer.nextLine();
                
        System.out.println(ca.getFrase()+" "+nuevaPalabra);
    }
    
    public void reemplazar(Cadena ca){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una letra o simbolo");
        String letra = leer.nextLine();
        
        String [] palabras = new String [ca.getLongitud()];        
        
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=ca.getFrase().substring(i, i+1);            
        }
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("a")){
                palabras[i]=letra;
            }            
        }
        
        letra="";
        
        for (String palabra : palabras) {
            letra = letra + palabra;            
        }
        System.out.println(letra);
        
    }
    
    
}
