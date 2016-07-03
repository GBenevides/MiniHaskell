package br.unb.cic.mh;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class TesteExpressaoAplicacao extends TesteUtil {

	@Test
	public void testeFuncaoIncrementa() {
		//Define o tipo de funcao
		DeclFuncao inc = (new DeclFuncao()).nome("inc")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(soma(ref("x"), vi(1)));
		//Insere-a no ambiente de execucao
		AmbienteExecucao.instance().declararFuncao(inc);
		
		//Aplica essa nova funcao?
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("inc").parametro(soma(vi(3), vi(2)));
		//Era pra ter dado 6
		Assert.assertEquals(new ValorInteiro(6), ap.avaliar());
	}
	
//	@Test
//	public void testeFuncaoFatorial() {
//		//Define o tipo de funcao
//		DeclFuncao fat = (new DeclFuncao()).nome("fat")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(If(igual(ref("x"),vi(0)), let("x",vi(0),null), fat(ref("x = x-1"))));
//				// TODO: Fat - Funcao recursiva...
//				
//				
//	} // TODO: Fat - Muito louco!!
	
}
