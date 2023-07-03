/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class CursoServicio {
    public void cargarAlumnos(Curso c){
        
        Scanner leer = new Scanner(System.in);
        String [] alumnos = new String [5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingrese el nombre del alumno");
            alumnos[i]= leer.next();            
        }
   
        c.setAlumnos(alumnos);
    }
    
    public Curso crearCurso(){
        Scanner leer = new Scanner(System.in);
        Curso c = new Curso();
        System.out.println("ingrese el nombre del curso");
        c.setNombreCurso(leer.nextLine());
        System.out.println("ingrese cantidad de horas por dia");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese cantidad de dias a la semana");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("ingrese turno m (mañana) o t (tarde)");
        c.setTurno(leer.next());
        System.out.println("ingrese precio por hora");
        c.setPrecioPorHora(leer.nextInt());
        cargarAlumnos(c);
        return c;
    }
    
    public int gananciaPorSemana(Curso c){
        int ganancias = c.getAlumnos().length*c.getCantidadHorasPorDia()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora();
        System.out.println("las ganacias de la semana fueron $"+ganancias);
        return ganancias;
    }
    
}
