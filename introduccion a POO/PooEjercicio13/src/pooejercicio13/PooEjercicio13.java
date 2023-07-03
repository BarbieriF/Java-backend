/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejercicio13;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author franc
 */
public class PooEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso c1 = cs.crearCurso();
        cs.gananciaPorSemana(c1);
    }
    
}
