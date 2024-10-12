package hn.uth.simple_junit_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
//	@Before
//	public void setup() {
//		System.out.println("Se acaba de ejecutar el metodo setup");
//	}
//	
//	@BeforeClass
//	public static void setUpClass() {
//		System.out.println("Se acaba de ejecutar el metodo setup class");
//	}
//	
//	@Test
//	public void miPrueba() {
//		System.out.println("Se acaba de ejecutar el metodo test prueba");
//	}
//	
//	@Test
//	public void miSegundaPrueba() {
//		System.out.println("Se acaba de ejecutar el metodo test segunda prueba");
//	}
//	
//	@After
//	public void tearDown() {
//		System.out.println("Se acaba de ejecutar el metodo tear down");
//	}
//	
//	@AfterClass
//	public static void tearDownClass() {
//		System.out.println("Se acaba de ejecutar el metodo tear down class");
//	}
//	
//	public void metodoAuxiliar1() {
//		System.out.println("Se acaba de ejecutar el metodo auxiliar 1");
//	}
//	
//	public void metodoAuxiliar2() {
//		System.out.println("Se acaba de ejecutar el metodo auxiliar 2");
//	}
	
	private static App calculadora;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Se acaba de ejecutar el metodo setup class");
		calculadora = new App();
	}
	
	@Test
	public void probandoLaSuma_paso_1() {
		double numero1 = 1;
		double numero2 = 1;
		double resultado = calculadora.sumar(numero1, numero2);
		assertEquals(numero1 + numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaSuma_paso_2() {
		double numero1 = 0.5;
		double numero2 = 0.4;
		double resultado = calculadora.sumar(numero1, numero2);
		assertEquals(numero1 + numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaSuma_paso_3() {
		double numero1 = -1;
		double numero2 = -2;
		double resultado = calculadora.sumar(numero1, numero2);
		assertTrue(numero1 + numero2 == resultado);
	}
	
	@Test
	public void probandoLaSuma_paso_4() {
		double numero1 = -0.3;
		double numero2 = -0.6;
		double resultado = calculadora.sumar(numero1, numero2);
		assertTrue(numero1 + numero2 == resultado);
	}
	
	@Test
	public void probandoLaSuma_paso_5() {
		double numero1 = 0.000001;
		double numero2 = 0.000005;
		double resultado = calculadora.sumar(numero1, numero2);
		assertTrue(numero1 + numero2 == resultado);
	}
	
	@Test
	public void probandoLaSuma_paso_6() {
		double numero1 = 50000000;
		double numero2 = 45948384;
		double resultado = calculadora.sumar(numero1, numero2);
		assertEquals(numero1 + numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaMulti_paso_7() {
		double numero1 = 50000000;
		double numero2 = 45948384;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.001);
	}
	
	
	@Test
	public void probandoLaMulti_paso_8() {
		double numero1 = 0;
		double numero2 = 0;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaMulti_paso_9() {
		double numero1 = 0;
		double numero2 = 900000;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaMulti_paso_10() {
		double numero1 = -5;
		double numero2 = -7;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaMulti_paso_11() {
		double numero1 = 0.33;
		double numero2 = 0.49;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaMulti_paso_12() {
		double numero1 = 0.000003;
		double numero2 = 0.0000049;
		double resultado = calculadora.multiplicar(numero1, numero2);
		assertEquals(numero1 * numero2, resultado, 0.00000001);
	}
	
	@Test
	public void probandoLaResta_paso_13() {
		double numero1 = 0.0000088;
		double numero2 = 0.0000049;
		double resultado = calculadora.restar(numero1, numero2);
		assertEquals(numero1 - numero2, resultado, 0.00000001);
	}
	
	@Test
	public void probandoLaResta_paso_14() {
		double numero1 = 100044033;
		double numero2 = 200590089;
		double resultado = calculadora.restar(numero1, numero2);
		assertEquals(numero1 - numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaResta_paso_15() {
		double numero1 = -100;
		double numero2 = -200;
		double resultado = calculadora.restar(numero1, numero2);
		assertEquals(numero1 - numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaResta_paso_16() {
		double numero1 = 5;
		double numero2 = 3;
		double resultado = calculadora.restar(numero1, numero2);
		assertEquals(numero1 - numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaResta_paso_17() {
		double numero1 = 5;
		double numero2 = 9;
		double resultado = calculadora.restar(numero1, numero2);
		assertEquals(numero1 - numero2, resultado, 0.001);
	}
	
	@Test
	public void probandoLaDivi_paso_18() {
		double dividendo = 8;
		double divisor = 4;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_19() {
		double dividendo = 9;
		double divisor = 4;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_20() {
		double dividendo = 2;
		double divisor = 400;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_21() {
		double dividendo = 0;
		double divisor = 20;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_22_entre_cero_1() {
		double dividendo = 100;
		double divisor = 0;
		Double resultado = calculadora.dividir(dividendo, divisor);
		assertNull(resultado);
	}
	
	@Test
	public void probandoLaDivi_paso_22_entre_cero_2() {
		double dividendo = 100;
		double divisor = 0;
		Double resultado = calculadora.dividir(dividendo, divisor);
		
		if(divisor == 0) {
			fail("No es posible dividir entre cero");
		}else {
			assertTrue(dividendo / divisor == resultado);
		}
	}
	
	@Test
	public void probandoLaDivi_paso_23() {
		double dividendo = 0.9;
		double divisor = 0.3;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_24() {
		double dividendo = -0.029;
		double divisor = -0.0034;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
	
	@Test
	public void probandoLaDivi_paso_25() {
		double dividendo = 1000000;
		double divisor = 50000;
		double resultado = calculadora.dividir(dividendo, divisor);
		assertEquals(dividendo / divisor, resultado, 0.000001);
	}
}
