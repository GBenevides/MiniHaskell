package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoOr {

	@Test
	public void testExpressaoOrSimples() {
		ValorBooleano vT = new ValorBooleano(true);
		ValorBooleano vF = new ValorBooleano(false);
		
		ExpressaoOr or = new ExpressaoOr(vT, vF);
		//or(vT, vF);
		
		// Teste: (true || false)
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		boolean expectedRes = true;

		Assert.assertEquals(new Boolean(true), res.getValor());
		Assert.assertTrue("Assert or simples", (res.getValor() == expectedRes));		
	}
	
	@Test
	public void testExpressaoOrComplexa() {
		ValorBooleano vTa = new ValorBooleano(true);
		ValorBooleano vTb = new ValorBooleano(true);
		ValorBooleano vF = new ValorBooleano(false);
		
		ExpressaoOr or1 = new ExpressaoOr(vTa, vTb);
		ExpressaoOr or2 = new ExpressaoOr(or1, vF);
		
		// Teste: ((true || true) || false)
		
		ValorBooleano res = (ValorBooleano)or2.avaliar();
		boolean expectedRes = true;
		
		Assert.assertEquals(new Boolean(true), res.getValor());
		Assert.assertTrue("Assert or complexo", (res.getValor() == expectedRes));	
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
