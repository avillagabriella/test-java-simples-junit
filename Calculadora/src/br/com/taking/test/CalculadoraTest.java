package br.com.taking.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.taking.main.Calculadora;

class CalculadoraTest {

	private Calculadora calculadora;

	@BeforeEach
	public void instanciarCalculadora() {
		calculadora = new Calculadora();

	}

	@Test
	void testSomar() {

//		Calculadora calculadora = new Calculadora();

		int resultadoCalculadora = calculadora.somar(10, 5);

		assertEquals(15, resultadoCalculadora);
	}

	@Test
	void testSubtrair() {

//		Calculadora calculadora = new Calculadora();

		int resultadoCalculadora = calculadora.subtrair(50, 25);

		assertEquals(25, resultadoCalculadora);
	}

	@Test
	void testMultiplicar() {

//		Calculadora calculadora = new Calculadora();

		int resultadoCalculadora = calculadora.multiplicar(3, 2);

		assertEquals(6, resultadoCalculadora);
	}

	@Test
	void testDividir() {

//		Calculadora calculadora = new Calculadora();

		int resultadoCalculadora = calculadora.dividir(50, 2);

		assertEquals(25, resultadoCalculadora);
	}

}
