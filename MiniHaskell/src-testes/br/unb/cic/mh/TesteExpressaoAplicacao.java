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

	@Test
	public void testeFuncaoFatorial() {
//		//Funcao auxiliar
//		DeclFuncao dec = (new DeclFuncao()).nome("dec")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(sub(ref("x"), vi(1)));
		
		//Define o tipo de funcao
		DeclFuncao auxFat = (new DeclFuncao()).nome("auxFat")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(If(igual(ref("x"), vi(0)), let("x", vi(1), soma(ref("x"),vi(0))), mult(ref("x") ,vi(1))));
		
		AmbienteExecucao.instance().declararFuncao(auxFat);
		
//		
//		DeclFuncao fat = (new DeclFuncao()).nome("fat")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(If(igual(ref("x"), vi(0)), let("x", vi(1), soma(ref("x"),vi(0))), mult(ref("x") ,sub(auxFat.getCorpo(),vi(1)))));
//		//(new ExpressaoAplicacao()).nome("fat").parametro(sub(ref("x"),vi(1))).avaliar()
		
//		DeclFuncao fat = (new DeclFuncao()).nome("fat")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(If(igual(ref("x"), vi(0)), let("x", vi(1), soma(ref("x"),vi(0))), mult(ref("x"),let("x",sub(ref("x"),vi(1)), soma(ref("x"),vi(0))) )));
//		
//		DeclFuncao fat = (new DeclFuncao()).nome("fat")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(If(igual(ref("x"), vi(0)), let("x", vi(1), soma(ref("x"),vi(0))), mult(ref("x"),this )));
//		
////		
//		DeclFuncao fat = (new DeclFuncao()).nome("fat")
//				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
//				.corpo(fat(ref("x"), vi(1)));
		
		//funcao fat(x)
		//	if(x==0)
		//		return let x = 1 in x + 0
		//	else
		// 
		//		return x*fat(x-1)
		
		//		return x*let x = x - 1 in x + 0
		
		// TODO: Fat - Funcao recursiva...
				
		//Insere-a no ambiente de execucao
	//	AmbienteExecucao.instance().declararFuncao(fat);
		
		//Aplica essa nova funcao?
	//	ExpressaoAplicacao ap = (new ExpressaoAplicacao()).nome("fat").parametro(vi(5));
		
		//Era pra ter dado 6
	//	Assert.assertEquals(new ValorInteiro(120), ap.avaliar());
				
	} // TODO: Fat - Muito louco!!

}
