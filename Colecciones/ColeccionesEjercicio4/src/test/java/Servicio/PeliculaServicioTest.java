/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
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
public class PeliculaServicioTest {
    
    public PeliculaServicioTest() {
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
     * Test of crearPelicula method, of class PeliculaServicio.
     */
    @Test
    public void testCrearPelicula() {
        System.out.println("crearPelicula");
        PeliculaServicio instance = new PeliculaServicio();
        Pelicula expResult = null;
        Pelicula result = instance.crearPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPeliculaLista method, of class PeliculaServicio.
     */
    @Test
    public void testAgregarPeliculaLista() {
        System.out.println("agregarPeliculaLista");
        PeliculaServicio instance = new PeliculaServicio();
        instance.agregarPeliculaLista();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaOrdenadaDuracionMenorAMayor method, of class PeliculaServicio.
     */
    @Test
    public void testListaOrdenadaDuracionMenorAMayor() {
        System.out.println("listaOrdenadaDuracionMenorAMayor");
        PeliculaServicio instance = new PeliculaServicio();
        ArrayList<Pelicula> expResult = null;
        ArrayList<Pelicula> result = instance.listaOrdenadaDuracionMenorAMayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaOrdenadaDuracionMayorAMenor method, of class PeliculaServicio.
     */
    @Test
    public void testListaOrdenadaDuracionMayorAMenor() {
        System.out.println("listaOrdenadaDuracionMayorAMenor");
        PeliculaServicio instance = new PeliculaServicio();
        ArrayList<Pelicula> expResult = null;
        ArrayList<Pelicula> result = instance.listaOrdenadaDuracionMayorAMenor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaOrdenadaTitulo method, of class PeliculaServicio.
     */
    @Test
    public void testListaOrdenadaTitulo() {
        System.out.println("listaOrdenadaTitulo");
        PeliculaServicio instance = new PeliculaServicio();
        ArrayList<Pelicula> expResult = null;
        ArrayList<Pelicula> result = instance.listaOrdenadaTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaOrdenadaDirector method, of class PeliculaServicio.
     */
    @Test
    public void testListaOrdenadaDirector() {
        System.out.println("listaOrdenadaDirector");
        PeliculaServicio instance = new PeliculaServicio();
        ArrayList<Pelicula> expResult = null;
        ArrayList<Pelicula> result = instance.listaOrdenadaDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
