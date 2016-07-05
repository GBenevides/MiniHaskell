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
		
		ValorLista Lint =
				new ValorLista(vi(1).getValor(), 
				new ValorLista(vi(2).getValor(), 
				new ValorLista(vi(3).getValor(), null)));
		
		ValorLista Lbool =
				new ValorLista(vb(true).getValor(), 
				new ValorLista(vb(false).getValor(), 
				new ValorLista(vb(false).getValor(), null)));
		
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
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoRefId() {
		System.out.println();
		System.out.print("Teste Ref: ");
		//ExpressaoRefId refI = ref("x");
		//Printer.visitar(refI);
		System.out.println();
	}

	@Test
	public void testVisitarExpressaoAplicacao() {
		//fail("Not yet implemented");
		// TODO: TestePPVisitor - Apply - Tenho medo dessa daqui
	}

	@Test
	public void testVisitarExpressaoSubtracao() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoIgualdade() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoAnd() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoMultiplicacao() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoOr() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoDivisao() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoNot() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoDiferente() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoMenor() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoMenorIgual() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoMaiorIgual() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoMaior() {
		//fail("Not yet implemented");
	}

	@Test
	public void testVisitarExpressaoFatorial() {
		//fail("Not yet implemented");
	}

}
