package br.unb.cic.mh;

import org.junit.Assert;

import org.junit.Test;

public class TesteExpressaoIgualdade {

	
//	@Test
//	public void testIgualdadeBooleanaSimples() {
//		ValorBooleano vT = new ValorBooleano(true);
//		ValorBooleano vF = new ValorBooleano(false);
//		
//		ExpressaoIgualdade igualdade = new ExpressaoIgualdade(vT, vF);
//		
//		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
//		boolean expectedRes = false; //Resultado esperado
//		
//		Assert.assertEquals(new Boolean(false), res.getValor());
//		assertTrue("Assert booleano simples", (res.getValor() == expectedRes));
//		
//		//fail("Not yet implemented");
//	
//	} TODO: Igualdade - Por enquanto, deve-se escolher se serao comparados dois inteiros ou dois booleanos.
	
	@Test
	public void testIgualdadeInteiraSimples() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4 = new ValorInteiro(4);
		
		ExpressaoIgualdade igualdade = new ExpressaoIgualdade(v7, v4);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		boolean expectedRes = false; //Resultado esperado
		
		Assert.assertEquals(new Boolean(false), res.getValor());
		Assert.assertTrue("Assert igualdade inteira simples", (res.getValor() == expectedRes));
	}
	
//	@Test
//	public void testIgualdadeInteiraComplexa() {
//		ValorInteiro v2a = new ValorInteiro(2);
//		ValorInteiro v2b = new ValorInteiro(2);
//		ValorInteiro v5 = new ValorInteiro(5);
//		
//		ExpressaoIgualdade igual1 = new ExpressaoIgualdade(v2a, v2b);
//		ExpressaoIgualdade igual2 = new ExpressaoIgualdade(igual1, v5);
//		// TODO: Igualdade - Nao ta dando para comparar booleano com inteiro. Fortemente tipada (?)
//		
//		
//		ValorBooleano res = (ValorBooleano)igual2.avaliar();
//		boolean expectedRes = false;
//		
//		Assert.assertEquals(new Boolean(false), res.getValor());
//		assertTrue("Assert igualdade inteira complexa", (res.getValor() == expectedRes));
//		
//	}
	

	/*
	@Test
	public void testTipo() {
		fail("Not yet implemented");
	}

	@Test
	public void testChecarTipo() {
		fail("Not yet implemented");
	}

	@Test
	public void testAvaliar() {
		fail("Not yet implemented");
	}

	@Test
	public void testAceitar() {
		fail("Not yet implemented");
	}
	*/

}
