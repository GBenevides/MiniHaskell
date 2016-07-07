package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteExpressaoNot {

	@Test
	public void testExpressaoNotSimples() {
		ValorBooleano v = new ValorBooleano(true);
		
		ExpressaoNot not = new ExpressaoNot(v);
		
		// Teste: (!true)
		
		ValorBooleano res = (ValorBooleano)not.avaliar();
		
		assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testExpressaoNotComplexa() {
		ValorBooleano v = new ValorBooleano(true);
		
		ExpressaoNot not1 = new ExpressaoNot(v);
		ExpressaoNot not2 = new ExpressaoNot(not1);
		
		// Teste: (!(!true))
		
		ValorBooleano res = (ValorBooleano)not2.avaliar();
		
		assertEquals(new Boolean(true), res.getValor());

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
