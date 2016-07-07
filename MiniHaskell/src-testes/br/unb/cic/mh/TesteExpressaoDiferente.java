package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDiferente {
	
	@Test
	public void testDiferencaBooleanaSimples() {
		ValorBooleano vT = new ValorBooleano(true);
		ValorBooleano vF = new ValorBooleano(false);
		
		ExpressaoDiferente igualdade = new ExpressaoDiferente(vT, vF);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		//boolean expectedRes = true; //Resultado esperado
		
		Assert.assertEquals(new Boolean(true), res.getValor());
	
   } 
	
	@Test
	public void testDiferencaInteiraSimples() {
		ValorInteiro v7 = new ValorInteiro(7);
		ValorInteiro v4 = new ValorInteiro(4);
		
		ExpressaoDiferente igualdade = new ExpressaoDiferente(v7, v4);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		boolean expectedRes = true; //Resultado esperado
		
		Assert.assertEquals(new Boolean(true), res.getValor());
		Assert.assertTrue("Assert igualdade inteira simples", (res.getValor() == expectedRes));
	}
	
	@Test
	public void testDiferencaComplexa() {
		ValorInteiro v2a = new ValorInteiro(2);
		ValorInteiro v2b = new ValorInteiro(2);
		ValorBooleano vT = new ValorBooleano(true);
		
		//Faremos o seguinte teste: ((2 != 2) != true) -> true
		
		
		ExpressaoDiferente igual1 = new ExpressaoDiferente(v2a, v2b);
		ExpressaoDiferente igual2 = new ExpressaoDiferente(igual1, vT);
		
		
		ValorBooleano res = (ValorBooleano)igual2.avaliar();
		//boolean expectedRes = true;
		
		Assert.assertEquals(new Boolean(true), res.getValor());
		//assertTrue("Assert igualdade inteira complexa", (res.getValor() == expectedRes));
		
	}
}
