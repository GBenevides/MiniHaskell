package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaiorIgual {
	
	@Test
	public void testMenorIgualInteiraSimples() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4 = new ValorInteiro(4);
		
		ExpressaoMaiorIgual igualdade = new ExpressaoMaiorIgual(v7, v4);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		boolean expectedRes = true; //Resultado esperado
		
		Assert.assertEquals(expectedRes, res.getValor());
		
	}
	
	@Test
	public void testMenorIgualComplexa() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4a = new ValorInteiro(4);
		ValorInteiro v4b = new ValorInteiro(4);
	
		
		ExpressaoMaiorIgual igual1 = new ExpressaoMaiorIgual(v4a, v4b);
		ExpressaoMaiorIgual igual2 = new ExpressaoMaiorIgual(v4a, v7);
		
		
		ValorBooleano res1 = (ValorBooleano)igual1.avaliar();
		ValorBooleano res2 = (ValorBooleano)igual2.avaliar();
		//boolean expectedRes = true;
		
		Assert.assertEquals(new Boolean(true), res1.getValor());
		Assert.assertEquals(new Boolean(false), res2.getValor());
		//assertTrue("Assert igualdade inteira complexa", (res.getValor() == expectedRes));
		
	}
}
