package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDivisao {
	@Test
	public void testMultiplicacaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		// Teste: (10 / 5)
		
		ExpressaoDivisao mult = new ExpressaoDivisao(v10, v5);
		
		ValorInteiro res = (ValorInteiro)mult.avaliar();
		Assert.assertEquals(new Integer(2), res.getValor());
	}
	
	@Test
	public void testMultiplicacaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v20 = new ValorInteiro(20);
		
		ExpressaoDivisao mult1 = new ExpressaoDivisao(v20, v2);
		ExpressaoDivisao mult2 = new ExpressaoDivisao(mult1, v5);
		
		ValorInteiro res = (ValorInteiro)mult2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(2), res);
	}
}
