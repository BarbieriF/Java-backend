/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class AlumnoServicioTest {
    
    public AlumnoServicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAlumnos method, of class AlumnoServicio.
     */
    @Test
    public void testGetAlumnos() {
        System.out.println("getAlumnos");
        AlumnoServicio instance = new AlumnoServicio();
        ArrayList<Alumno> expResult = null;
        ArrayList<Alumno> result = instance.getAlumnos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearAlumno method, of class AlumnoServicio.
     */
    @Test
    public void testCrearAlumno() {
        System.out.println("crearAlumno");
        AlumnoServicio instance = new AlumnoServicio();
        instance.crearAlumno();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notaFinal method, of class AlumnoServicio.
     */
    @Test
    public void testNotaFinal() {
        System.out.println("notaFinal");
        String nombre = "";
        AlumnoServicio instance = new AlumnoServicio();
        int expResult = 0;
        int result = instance.notaFinal(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
