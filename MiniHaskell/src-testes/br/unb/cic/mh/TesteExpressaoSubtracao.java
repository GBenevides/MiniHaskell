package br.unb.cic.mh;


import org.junit.Assert;
import org.junit.Test;

 

public class TesteExpressaoSubtracao {

	
	@Test
	public void testSubtracaoSimples(){
		ValorInteiro v3 = new ValorInteiro(3);
		ValorInteiro v2 = new ValorInteiro(2);
		
		ExpressaoSubtracao sub = new ExpressaoSubtracao(v3,v2);
		
		ValorInteiro res = (ValorInteiro)sub.avaliar();
		Assert.assertEquals(new Integer(1), res.getValor());
	}
	
	@Test
	public void testSubtracaoComplexa(){
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v3 = new ValorInteiro(3);
		
		ExpressaoSubtracao sub1 = new ExpressaoSubtracao(v3,v2);
		ExpressaoSubtracao sub2 = new ExpressaoSubtracao(sub1,v10);
		
		ValorInteiro res = (ValorInteiro)sub2.avaliar();
		Assert.assertEquals(new Integer(-9), res.getValor());
		
	}
	
	
	
}
