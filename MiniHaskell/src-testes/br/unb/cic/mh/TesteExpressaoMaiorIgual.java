package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaiorIgual {
	
	@Test
	public void testMaiorIgualInteiraSimples() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4 = new ValorInteiro(4);
		
		// Teste: (7 >= 4)
		
		ExpressaoMaiorIgual maiorIgual = new ExpressaoMaiorIgual(v7, v4);
		
		ValorBooleano res = (ValorBooleano)maiorIgual.avaliar();
		boolean expectedRes = true; //Resultado esperado
		
		Assert.assertEquals(expectedRes, res.getValor());
		
	}
	
	@Test
	public void testMaiorIgualComplexa() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4a = new ValorInteiro(4);
		ValorInteiro v4b = new ValorInteiro(4);
		
		// Teste: (4 >= 4) (4 >= 7)	
		
		ExpressaoMaiorIgual maiorIgual1 = new ExpressaoMaiorIgual(v4a, v4b);
		ExpressaoMaiorIgual maiorIgual2 = new ExpressaoMaiorIgual(v4a, v7);
		
		
		ValorBooleano res1 = (ValorBooleano)maiorIgual1.avaliar();
		ValorBooleano res2 = (ValorBooleano)maiorIgual2.avaliar();
		//boolean expectedRes = true;
		
		Assert.assertEquals(new Boolean(true), res1.getValor());
		Assert.assertEquals(new Boolean(false), res2.getValor());
		//assertTrue("Assert igualdade inteira complexa", (res.getValor() == expectedRes));
		
	}
}
