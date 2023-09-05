/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void crearAlumno(){
        boolean bandera = true;
        while(bandera){
            System.out.println("ingrese 1 para cargar un alumno al sistema, ingrese 2 para salir");
            int op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    System.out.println("ingrese nombre del alumno");
                    String nombre = leer.nextLine();
                    System.out.println("ingrese nota de primer parcial");
                    int notaPrimerParcial = leer.nextInt();
                    System.out.println("ingrese nota de segundo parcial");
                    int notaSegundoParcial = leer.nextInt();
                    System.out.println("ingrese nota de tercer parcial");
                    int notaTercerParcial = leer.nextInt();
        
                    ArrayList<Integer> notas = new ArrayList();
                    notas.add(notaPrimerParcial);
                    notas.add(notaSegundoParcial);
                    notas.add(notaTercerParcial);
        
                    Alumno a = new Alumno(nombre, notas);
            
                    alumnos.add(a);                    
                    break;
                case 2:
                    System.out.println("saliendo");
                    bandera = false;
                    break;
            }
            
        }
        
        
    }
    
    public int notaFinal(String nombre){
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < alumnos.size(); i++) {
            String nombreLista = alumnos.get(i).getNombre();
            if(nombreLista.equals(nombre)){
                notas = alumnos.get(i).getNotas();
            }
            
        }
        int nota = 0;        
        Iterator <Integer> it = notas.iterator();
        while (it.hasNext()) {
            nota += it.next();          
            
        }
        return nota/notas.size();
    }
    
    
}
