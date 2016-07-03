package br.unb.cic.mh;

import org.junit.Test;

import org.junit.Assert;

public class TesteExpressaoAnd {

	@Test
	public void testExpressaoAndSimples() {
		ValorBooleano vTa = new ValorBooleano(true);
		ValorBooleano vTb = new ValorBooleano(true);
		
		ExpressaoAnd and = new ExpressaoAnd(vTa, vTb);
		//and(vTa, vTb);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		boolean expectedRes = true;

		Assert.assertEquals(new Boolean(true), res.getValor());
		Assert.assertTrue("Assert and simples", (res.getValor() == expectedRes));		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testExpressaoAndComplexa() {
		ValorBooleano vTa = new ValorBooleano(true);
		ValorBooleano vTb = new ValorBooleano(true);
		ValorBooleano vF = new ValorBooleano(false);
		
		ExpressaoAnd and1 = new ExpressaoAnd(vTa, vTb);
		ExpressaoAnd and2 = new ExpressaoAnd(and1, vF);
		
		ValorBooleano res = (ValorBooleano)and2.avaliar();
		boolean expectedRes = false;
		
		Assert.assertEquals(new Boolean(false), res.getValor());
		Assert.assertTrue("Assert and complexo", (res.getValor() == expectedRes));	
		
		//fail("Not yet implemented");
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
