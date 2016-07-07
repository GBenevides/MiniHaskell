package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMultiplicacao {

	@Test
	public void testMultiplicacaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		// Teste: (5 * 10)
		
		ExpressaoMultiplicacao mult = new ExpressaoMultiplicacao(v5, v10);
		
		ValorInteiro res = (ValorInteiro)mult.avaliar();
		Assert.assertEquals(new Integer(50), res.getValor());
	}
	
	@Test
	public void testMultiplicacaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v20 = new ValorInteiro(20);
		
		// Teste: ((5 * 10) * 20)
		
		ExpressaoMultiplicacao mult1 = new ExpressaoMultiplicacao(v5, v10);
		ExpressaoMultiplicacao mult2 = new ExpressaoMultiplicacao(mult1, v20);
		
		ValorInteiro res = (ValorInteiro)mult2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(1000), res);
	}
	
}
