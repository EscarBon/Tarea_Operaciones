package hn.uth.operaciones_aritmetcas;

import static org.junit.Assert.*;
import org.junit.*;


public class AppTest 
{
	@BeforeClass
    public static void Inicio() {
        System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
    }

@Test
	public void testcirculo1() {
		assertTrue(App.acirculo(3)==28.2744);
}

	public void testcirculo2() {
		assertEquals(App.acirculo(8.2),211.241184,0.0001);
		
}
	public void testcirculo3() {
		assertNotNull(App.acirculo(4)==50.2656);
}
	
	//test cuadrado
	@Test
	public void testcuadrado1() {
		assertTrue(App.acuadrado(9)==81);
}

	public void testcuadrado2() {
		assertEquals(App.acuadrado(5),25,0.0001);
		
}
	public void testcuadrado3() {
		assertNotNull(App.acuadrado(45)==2025);
}
	//test rectangulo
	@Test
	public void testrectangulo1() {
		assertTrue(App.arectangulo(9,2)==18);
}

	public void testrectangulo2() {
		assertEquals(App.arectangulo(5.7,20),114,0.0001);
		
}
	public void testrectangulo3() {
		assertNotNull(App.arectangulo(7,3)==21);
}
	//area triángulo
	
	public void testtriangulo1() {
		assertTrue(App.atriangulo(10,5)==25);
}

	public void testtritangulo2() {
		assertEquals(App.atriangulo(9,20),90,0.0001);
		
}
	public void testtriangulo3() {
		assertNotNull(App.atriangulo(7,15)==105);
}
	@AfterClass
    public static void finalizacionPruebas() {
        System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
    }
}
