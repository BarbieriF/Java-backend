/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Entidades.Rectangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicio.RectanguloServicio;

/**
 *
 * @author ASUS
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    RectanguloServicio rs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rs = new RectanguloServicio();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());        
    }
    
    @Test     
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(20, rs.calcularArea(new Rectangulo(10,2)),0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)),0);
    }
    
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)),0);
        assertEquals(50, rs.calcularPerimetro(new Rectangulo(10,15)),0);
        assertEquals(4, rs.calcularPerimetro(new Rectangulo(1,1)),0);
    }
    
    @Test
    public void deberiaActivarDesactivar(){
        Rectangulo r = new Rectangulo(10,10);
        assertTrue(r.isActivo());
        r.setActivo(false);
        assertFalse(r.isActivo());
    }
}
