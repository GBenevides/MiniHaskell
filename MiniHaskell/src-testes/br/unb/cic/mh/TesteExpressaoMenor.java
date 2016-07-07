package br.unb.cic.mh;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteExpressaoMenor {

	@Test
	public void testExpressaoMenorSimples() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4 = new ValorInteiro(4);
		
		ExpressaoMenor menor = new ExpressaoMenor(v7, v4);
		//menor(v7, v4);
		
		// Teste: (7 < 4)
		
		ValorBooleano res = (ValorBooleano)menor.avaliar();
		
		assertEquals(new Boolean(false), res.getValor());
	}
	
//	@Test
//	public void testExpressaoMenorComplexa() {
//		ValorInteiro v7 = new ValorInteiro(7);
//		ValorInteiro v4 = new ValorInteiro(4);
//		ValorInteiro v10 = new ValorInteiro(10);
//		
//		ExpressaoMenor menor1 = new ExpressaoMenor(v7, v4);
//		ExpressaoMenor menor2 = new ExpressaoMenor(menor1, v10);
//		//menor(v7, v4);
//		//menor(menor(v7, v4), v10);
//		
//		// Teste: ((7 < 4) < 10)
//		
//		ValorBooleano res = (ValorBooleano)menor2.avaliar();
//		
//		assertEquals(new Boolean(true), res.getValor());
//		
//		//fail("Not yet implemented");
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
