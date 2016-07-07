package br.unb.cic.mh;

import org.junit.Test;
import org.junit.Assert;

public class TesteExpressaoAplicacao extends TesteUtil {

	@Test
	public void testeFuncaoIncrementa() {
		//Define o tipo de funcao
		DeclFuncao inc = (new DeclFuncao()).nome("inc")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(soma(ref("x"), vi(1)));
		
		// funcao inc(x)
		//    retorna x + 1;
		
		//Insere-a no ambiente de execucao
		AmbienteExecucao.instance().declararFuncao(inc);
		
		//Aplica essa nova funcao?
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("inc").parametro(soma(vi(3), vi(2)));
		
		// inc(3 + 2)
		
		//Era pra ter dado 6
		Assert.assertEquals(new ValorInteiro(6), ap.avaliar());
	}
	
	@Test
	public void testeFuncaoDecrementa() {
		//Define o tipo de funcao
		DeclFuncao dec = (new DeclFuncao()).nome("dec")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(sub(ref("x"), vi(1)));
		
		// funcao dec(x)
		//    retorna x - 1;
		
		//Insere-a no ambiente de execucao
		AmbienteExecucao.instance().declararFuncao(dec);
		
		//Aplica essa nova funcao?
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("dec").parametro(mult(vi(3), vi(3)));
		
		// dec(3 * 3)
		
		//Era pra ter dado 8
		Assert.assertEquals(new ValorInteiro(8), ap.avaliar());
	}
	
	@Test
	public void testeMediaDoisNumeros() {
		//Definicao
		DeclFuncao med = (new DeclFuncao()).nome("med")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.argumento(new ArgumentoFormal("y", Tipo.INTEIRO))
				.corpo(div(soma(ref("x"), ref("y")), vi(2)));
		
		// funcao med(x, y)
		//	  retorna (x + y) / 2
		
		//Insercao
		AmbienteExecucao.instance().declararFuncao(med);
		
		//Aplicacao
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("med").parametro(vi(3)).parametro(vi(5));
		
		//Espera-se 4
		Assert.assertEquals(vi(4), ap.avaliar());
	}
}
