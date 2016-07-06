package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Test;

import br.unb.cic.mh.visitor.PPVisitor;

public class TestePPVisitor extends TesteUtil{
	PPVisitor Printer = new PPVisitor();

	@Test
	public void testVisitarValorInteiro() {
		System.out.println();
		System.out.print("Teste inteiro: ");
		Printer.visitar(vi(2));
		System.out.println();
	}

	@Test
	public void testVisitarValorBooleano() {
		System.out.println();
		System.out.print("Teste booleano: ");
		Printer.visitar(vb(true));
		System.out.print(" is not ");
		Printer.visitar(vb(false));
		System.out.println();
	}

	@Test
	public void testVisitarValorLista() {
//		
//		ValorLista Lint =
//				new ValorLista(vi(1).getValor(), 
//						new ValorLista(vi(2).getValor(), 
//								new ValorLista(vi(3).getValor())));
		// [1,
		//		[2,
		//			[3]
		
		ValorLista Lint = new ValorLista(sub(vi(1), vi(7))); // <ValorInteiro> .getValor()
		Lint.add(new ValorLista(soma(vi(3), vi(8))));
		Lint.add(new ValorLista(vi(2), null));
		
		System.out.println("\nTamanho da lista: " + Lint.tamanho().getValor());
		
		System.out.println("\nElemento na Posicao 2 da lista de inteiros: " + ((ValorConcreto) Lint.position(vi(1)).avaliar()).getValor());
		
		ValorLista Lbool = new ValorLista(vb(true));
		Lbool.add(new ValorLista(vb(false)));
		Lbool.add(new ValorLista(vb(false)));
		
		System.out.println("\nElemento na Posicao 2 da lista de booleanos: " + ((ValorConcreto) Lbool.position(vi(1)).avaliar()).getValor());
		
		System.out.println();
		System.out.print("Teste lista de inteiros: ");
		Printer.visitar(Lint);
		System.out.println();
		
		System.out.print("Teste lista de booleanos: ");
		Printer.visitar(Lbool);
		System.out.println();		
	}

	@Test
	public void testVisitarExpressaoIfThenElse() {
		ValorInteiro int1 = vi(5);
		ValorInteiro int2 = vi(10);
		
		ExpressaoIfThenElse Comp = If(igual(vb(true), vb(false)), mult(int1, int2), sub(int2, int1));
		
		System.out.println();
		System.out.print("Teste Comandos de Decisão: ");
		Printer.visitar(Comp);
		System.out.println();
		
		System.out.print("Teste Comandos de Decisão (then): ");
		Comp.getClausulaThen().aceitar(Printer);
		System.out.println();
		
		System.out.print("Teste Comandos de Decisão (else): ");
		Comp.getClausulaElse().aceitar(Printer);
		System.out.println();
		
		System.out.print("Teste Comandos de Decisão (avaliada): ");
		Comp.avaliar().aceitar(Printer);
		System.out.println();
	}

	@Test
	public void testVisitarExpressaoLet() {
		
		ExpressaoLet testLet;
		testLet = let("ref_id", vi(5), soma(ref("ref_id"), vi(7)));
		
		testLet.avaliar();
		
		System.out.println();
		System.out.print("Teste Let: ");
		Printer.visitar(testLet);
		System.out.println();
		
		System.out.print("Teste Let (avaliada): ");
		testLet.avaliar().aceitar(Printer);
		System.out.println();
	}

	@Test
	public void testVisitarExpressaoSoma() {
		System.out.print("\nTeste Soma: ");
		Printer.visitar(soma(vi(9), vi(7)));
		System.out.println();
		// (9 + 7)
	}

	@Test
	public void testVisitarExpressaoRefId() {
		System.out.print("\nTeste Ref: ");
		ExpressaoRefId refI = ref("x");
		AmbienteExecucao.instance().associarExpressao(refI.getId(), vi(0));
		//let("x", vi(0), soma(refI, vi(0)));
		Printer.visitar(refI);
		System.out.println();
	}

	@Test
	public void testVisitarExpressaoAplicacao() {
		
		DeclFuncao inc = (new DeclFuncao()).nome("inc")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(soma(ref("x"), vi(1)));
		
		// funcao inc(x)
		//    x = x + 1;
		
		//Insere-a no ambiente de execucao
		AmbienteExecucao.instance().declararFuncao(inc);
		
		//Aplica essa nova funcao?
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("inc").parametro(soma(sub(vi(3), vi(2)), vi(8)));
		
		// inc((3 - 2) + 8)
		
		System.out.print("\nTeste Aplicacao: ");
		Printer.visitar(ap);
		System.out.println();
		
		//fail("Not yet implemented");
		// TODO: TestePPVisitor - Apply - Tenho medo dessa daqui
	}

	@Test
	public void testVisitarExpressaoSubtracao() {
		System.out.print("\nTeste Subtracao: ");
		Printer.visitar(sub(vi(24), vi(1)));
		System.out.println();
		// (24 - 1)
	}

	@Test
	public void testVisitarExpressaoIgualdade() {
		System.out.print("\nTeste Igualdade de Inteiros: ");
		Printer.visitar(igual(vi(2), vi(1)));
		// (2 == 1)
		
		System.out.print("\nTeste Igualdade de Booleanos: ");
		Printer.visitar(igual(vb(true), vb(true)));
		System.out.println();
		// (True == True)
	}

	@Test
	public void testVisitarExpressaoAnd() {
		System.out.print("\nTeste And: ");
		Printer.visitar(and(vb(true), vb(false)));
		System.out.println();
		// (True && False)
	}

	@Test
	public void testVisitarExpressaoMultiplicacao() {
		System.out.print("\nTeste Multiplicacao: ");
		Printer.visitar(mult(vi(2), vi(4)));
		System.out.println();
		// (2 * 4)
	}

	@Test
	public void testVisitarExpressaoOr() {
		System.out.print("\nTeste Or: ");
		Printer.visitar(or(vb(true), vb(false)));
		System.out.println();
		// (True || False)
	}

	@Test
	public void testVisitarExpressaoDivisao() {
		System.out.print("\nTeste Divisao: ");
		Printer.visitar(div(vi(10), vi(5)));
		System.out.println();
		// (10 / 5)
	}

	@Test
	public void testVisitarExpressaoNot() {
		System.out.print("\nTeste Not: ");
		Printer.visitar(not(vb(false)));
		System.out.println();
		// (!False)
	}

	@Test
	public void testVisitarExpressaoDiferente() {
		System.out.print("\nTeste Diferente de Inteiros: ");
		Printer.visitar(dif(vi(2), vi(1)));
		// (2 != 1)
		
		System.out.print("\nTeste Diferente de Booleanos: ");
		Printer.visitar(dif(vb(true), vb(true)));
		System.out.println();
		// (True != True);
	}

	@Test
	public void testVisitarExpressaoMenor() {
		System.out.print("\nTeste Menor: ");
		Printer.visitar(menor(vi(7), vi(3)));
		System.out.println();
		// (7 < 3)
	}

	@Test
	public void testVisitarExpressaoMenorIgual() {
		System.out.print("\nTeste MenorIgual: ");
		Printer.visitar(menorIgual(vi(7), vi(90)));
		System.out.println();
		// (7 <= 90)
	}

	@Test
	public void testVisitarExpressaoMaiorIgual() {
		System.out.print("\nTeste MaiorIgual: ");
		Printer.visitar(maiorIgual(vi(10), vi(21)));
		System.out.println();
		// (10 >= 21)
	}

	@Test
	public void testVisitarExpressaoMaior() {
		System.out.print("\nTeste Maior: ");
		Printer.visitar(maior(vi(1), vi(0)));
		System.out.println();
		// (1 > 0)
	}

	@Test
	public void testVisitarExpressaoFatorial() {
		System.out.print("\nTeste Fatorial: ");
		Printer.visitar(fat(vi(5)));
		System.out.println();
		// (5!)
	}

}
