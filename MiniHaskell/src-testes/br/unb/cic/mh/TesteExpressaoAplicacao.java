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
}
