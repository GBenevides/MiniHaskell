package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoFatorial {

	
	@Test
	public void testFatorialSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		// Teste: (5!)
	
		ExpressaoFatorial fat = new ExpressaoFatorial(v5);
		
		ValorInteiro res = (ValorInteiro)fat.avaliar();
		Assert.assertEquals(new Integer(120), res.getValor());
	}
	
	@Test
	public void testFatorialComplexa() {
		ValorInteiro v3  = new ValorInteiro(3);
		
		// Teste: ((3!)!)
	
		ExpressaoFatorial fat1 = new ExpressaoFatorial(v3);
		ExpressaoFatorial fat2 = new ExpressaoFatorial(fat1.avaliar());
		
		ValorInteiro res = (ValorInteiro)fat2.avaliar();
		Assert.assertEquals(new Integer(720), res.getValor());
	}

}
