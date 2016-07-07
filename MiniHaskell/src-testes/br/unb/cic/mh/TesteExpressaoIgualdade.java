package br.unb.cic.mh;

import org.junit.Assert;

import org.junit.Test;

public class TesteExpressaoIgualdade {

	
	@Test
	public void testIgualdadeBooleanaSimples() {
		ValorBooleano vT = new ValorBooleano(true);
		ValorBooleano vF = new ValorBooleano(false);
		
		ExpressaoIgualdade igualdade = new ExpressaoIgualdade(vT, vF);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		//boolean expectedRes = false; //Resultado esperado
		
		Assert.assertEquals(new Boolean(false), res.getValor());
	
   } 
	
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
	
	@Test
	public void testIgualdadeComplexa() {
		ValorInteiro v2a = new ValorInteiro(2);
		ValorInteiro v2b = new ValorInteiro(2);
		ValorBooleano vT = new ValorBooleano(true);
		
		//Faremos o seguinte teste: ((2 == 2) == true)
		
		
		ExpressaoIgualdade igual1 = new ExpressaoIgualdade(v2a, v2b);
		ExpressaoIgualdade igual2 = new ExpressaoIgualdade(igual1, vT);
		
		
		ValorBooleano res = (ValorBooleano)igual2.avaliar();
		//boolean expectedRes = true;
		
		Assert.assertEquals(new Boolean(true), res.getValor());
		//assertTrue("Assert igualdade inteira complexa", (res.getValor() == expectedRes));
		
	}

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
