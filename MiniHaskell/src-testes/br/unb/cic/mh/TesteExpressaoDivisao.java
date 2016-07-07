package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDivisao {
	@Test
	public void testDivisaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		// Teste: (10 / 5)
		
		ExpressaoDivisao div = new ExpressaoDivisao(v10, v5);
		
		ValorInteiro res = (ValorInteiro)div.avaliar();
		Assert.assertEquals(new Integer(2), res.getValor());
	}
	
	@Test
	public void testDivisaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v20 = new ValorInteiro(20);
		
		// Teste: ((20 / 2) / 5)
		
		ExpressaoDivisao div1 = new ExpressaoDivisao(v20, v2);
		ExpressaoDivisao div2 = new ExpressaoDivisao(div1, v5);
		
		ValorInteiro res = (ValorInteiro)div2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(2), res);
	}
}
