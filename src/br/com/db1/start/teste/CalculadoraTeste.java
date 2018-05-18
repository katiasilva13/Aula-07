package br.com.db1.start.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classe.Calculadora;

public class CalculadoraTeste {

	private Calculadora calculadora = new Calculadora();

	@Before
	public void init() {
		calculadora.setValor1(2d);
		Assert.assertTrue(2 == calculadora.getValor1());
		calculadora.setValor2(2d);
		Assert.assertTrue(2 == calculadora.getValor2());
	}

	@Test
	public void somarTeste() {
		Assert.assertTrue(4 == calculadora.somar());
	}

	@Test
	public void subtrairTeste() {
		Assert.assertTrue(0 == calculadora.subtrair());
	}

	@Test
	public void zerarTeste(){
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
	}
	
	@Test
	public void multiplicarTeste() {
		Assert.assertTrue(4 == calculadora.multiplicar());
	}
	
	@Test
	public void dividirTeste() {
		Assert.assertTrue(1 == calculadora.dividir());
	}
}
