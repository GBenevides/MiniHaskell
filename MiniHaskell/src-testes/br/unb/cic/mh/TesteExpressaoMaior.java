package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteExpressaoMaior {

	@Test
	public void testExpressaoMaiorSimples() {
		ValorInteiro v21 = new ValorInteiro(21);
		ValorInteiro v19 = new ValorInteiro(19);
		
		ExpressaoMaior maior = new ExpressaoMaior(v21, v19);
		//maior(v21, v19);
		
		// Teste: (21 > 19)
		
		ValorBooleano res = (ValorBooleano)maior.avaliar();
		
		assertEquals(new Boolean(true), res.getValor());
		
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
