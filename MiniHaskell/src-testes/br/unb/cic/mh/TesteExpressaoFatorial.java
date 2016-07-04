package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoFatorial {

	
	@Test
	public void testFatorial() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v1  = new ValorInteiro(0);
		
		ExpressaoFatorial fat = new ExpressaoFatorial(v5, v1);
		
		ValorInteiro res = (ValorInteiro)fat.avaliar();
		Assert.assertEquals(new Integer(120), res.getValor());
	}
	

}
